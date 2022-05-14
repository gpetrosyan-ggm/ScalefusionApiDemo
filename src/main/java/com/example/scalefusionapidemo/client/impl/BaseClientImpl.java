package com.example.scalefusionapidemo.client.impl;

import com.example.scalefusionapidemo.client.BaseClient;
import com.example.scalefusionapidemo.model.base.ApiResponseModel;
import com.example.scalefusionapidemo.model.base.Pair;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class BaseClientImpl implements BaseClient {

    @Override
    public <T> ApiResponseModel<Optional<T>> getRequest(final String rootUri,
                                                        final String path,
                                                        final List<Pair<String, Object>> params,
                                                        final List<Pair<String, String>> headerParams,
                                                        final Class<T> respType) {
        ApiResponseModel<Optional<T>> model = new ApiResponseModel<>();
        try {
            final String uri = buildUri(path, params);
            T response = WebClient.builder()
                                  .baseUrl(rootUri)
                                  .defaultHeaders(headers(headerParams))
                                  .build()
                                  .get()
                                  .uri(uri)
                                  .retrieve()
                                  .bodyToMono(respType)
                                  .block();
            model.setResponse(Optional.ofNullable(response));
            model.setHasException(false);
        } catch (Throwable t) {
            model.setException(t);
            model.setExceptionMessage(t.getMessage());
            model.setHasException(true);
        }
        return model;
    }

    @Override
    public List<Pair<String, String>> defaultHeaderParams(final boolean withAuth, final String token) {
        List<Pair<String, String>> headerParams = new ArrayList<>();
        headerParams.add(Pair.of(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE));
        headerParams.add(Pair.of(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE));
        if (withAuth && token != null && !token.isEmpty()) {
            headerParams.add(Pair.of(HttpHeaders.AUTHORIZATION, "Token " + token));
        }
        return headerParams;
    }

    private String buildUri(final String path, final List<Pair<String, Object>> params) {
        StringBuilder builder = new StringBuilder(path);
        if (!CollectionUtils.isEmpty(params)) {
            builder.append("?");
            for (Pair<String, Object> p : params) {
                if (p.getValue() == null) {
                    continue;
                }
                builder.append(p.getKey()).append("=").append(p.getValue()).append("&");
            }
            builder.setLength(builder.length() - 1);
        }
        return builder.toString();
    }

    private Consumer<HttpHeaders> headers(final List<Pair<String, String>> headerParams) {
        return httpHeaders -> headerParams.forEach(param -> httpHeaders.set(param.getKey(), param.getValue()));
    }

}
