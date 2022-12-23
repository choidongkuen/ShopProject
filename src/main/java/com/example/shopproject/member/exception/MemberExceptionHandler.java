package com.example.shopproject.member.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class MemberExceptionHandler {


    @ExceptionHandler(MemberException.class)
    protected ResponseEntity<?> handleMemberException(MemberException e){

        log.error(e.getMessage());

        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
