package com.example.demo.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Map;

@RestControllerAdvice
public class HandlerException {

  private static final Logger LOG = LogManager.getLogger(HandlerException.class);

  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handleGlobalException(Exception e) {
    LOG.error("Handling exception {}", e.getMessage(), e);
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oops! Something went wrong");
  }

  @ExceptionHandler(NoResourceFoundException.class)
  public ResponseEntity<?> handleNoResourceFoundException(NoResourceFoundException e) {
    if (e.getMessage().contains("favicon.ico")) {
      return (ResponseEntity<?>) ResponseEntity.ok();
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with current id not found");
  }

  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException e) {
    LOG.error("Handling user not found exception {}", e.getMessage(), e);
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with current id not found");
  }
}
