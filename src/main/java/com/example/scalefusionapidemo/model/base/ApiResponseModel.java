package com.example.scalefusionapidemo.model.base;

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
