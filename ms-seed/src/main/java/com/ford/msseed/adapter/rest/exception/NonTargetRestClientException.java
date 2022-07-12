package com.ford.msseed.adapter.rest.exception;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public final class NonTargetRestClientException extends GenericException {

    public NonTargetRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
