package com.example.Person1.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class ApiExceptionHandler {
//    @ExceptionHandler(value = {ApiRequestException.class})
//    public ResponseEntity<Object>handleApiRequestException(ApiRequestException e) {
//        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
//        ApiException apiException = new ApiException(
//                e.getMessage(),
//                e,
//                badRequest,
//                ZonedDateTime.now(ZoneId.of("Z"))
//        );
//        return new ResponseEntity<>(apiException, badRequest);
 //   }
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

