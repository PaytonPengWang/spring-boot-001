package com.example.demo.exception;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;

public class CustomDuplicatedKeyException extends DuplicateKeyException {
    public CustomDuplicatedKeyException(String msg) {
        super(msg);
    }

    public CustomDuplicatedKeyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
