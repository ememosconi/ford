package com.ford.msseed.adapter.rest.exception;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public final class EmptyOrNullBodyRestClientException extends GenericException {

    public EmptyOrNullBodyRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
