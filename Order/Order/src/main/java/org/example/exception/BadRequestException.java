package org.example.exception;

import lombok.Data;

import java.util.List;

@Data
public class BadRequestException extends RuntimeException{

    private String message;

    public BadRequestException(String message) {
        super(message);
    }
}
