package com.ford.msseed.application.exception;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public class BusinessException extends GenericException {

    public BusinessException(ErrorCode errorCode){
        super(errorCode);
    }
}
