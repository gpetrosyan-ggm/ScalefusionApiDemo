package com.example.scalefusionapidemo.common.model.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseModel<T> {

    private Boolean hasException;

    private String exceptionMessage;

    private Throwable exception;

    private T response;

}
