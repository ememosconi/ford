package com.ford.msseed.adapter.rest.exception;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public final class NotFoundRestClientException extends GenericException {

    public NotFoundRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }
}
