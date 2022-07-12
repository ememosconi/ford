package com.ford.msseed.adapter.kafka.exeption;


import com.ford.msseed.config.ErrorCode;
import com.ford.msseed.config.GenericException;

public class NotificationException extends GenericException {

    public NotificationException(ErrorCode ec){
        super(ec);
    }
}
