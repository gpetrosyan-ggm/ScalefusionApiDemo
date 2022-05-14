package com.example.scalefusionapidemo.client;

import com.example.scalefusionapidemo.model.base.ApiResponseModel;
import com.example.scalefusionapidemo.model.base.Pair;

import java.util.List;
import java.util.Optional;

public interface BaseClient {

    <T> ApiResponseModel<Optional<T>> getRequest(final String rootUri,
                                                 final String path,
                                                 final List<Pair<String, Object>> params,
                                                 final List<Pair<String, String>> headerParams,
                                                 final Class<T> respType);

    List<Pair<String, String>> defaultHeaderParams(final boolean withAuth, final String token);

}
