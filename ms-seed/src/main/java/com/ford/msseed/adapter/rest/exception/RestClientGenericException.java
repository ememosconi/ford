package com.ford.msseed.adapter.rest.exception;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public final class RestClientGenericException extends GenericException {

    public RestClientGenericException(ErrorCode errorCode) {
        super(errorCode);
    }

}
