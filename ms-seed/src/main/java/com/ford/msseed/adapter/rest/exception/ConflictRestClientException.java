package com.ford.msseed.adapter.rest.exception;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public class ConflictRestClientException extends GenericException {
    public ConflictRestClientException(ErrorCode ec) {
        super(ec);
    }
}
