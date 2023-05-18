package com.example.Person1.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ApiExceptionHandler {



    @ExceptionHandler(ApiRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ApiException handleApiRequestException(ApiRequestException ex) {
        return new ApiException(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ApiException handleApiRequestException1(Exception ex) {
        return new ApiException(HttpStatus.OK.value(), "your id does not exist");
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiException handleApiRequestException2(Exception ex) {
        return new ApiException(HttpStatus.OK.value(), ex.getMessage());
    }
}

