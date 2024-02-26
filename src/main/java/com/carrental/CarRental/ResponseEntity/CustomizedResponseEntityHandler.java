package com.carrental.CarRental.ResponseEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;


@RestControllerAdvice
public class CustomizedResponseEntityHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){
        ExceptionResponse response  = new ExceptionResponse(System.currentTimeMillis(),request.getDescription(false));
        return new ResponseEntity(response,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());

        ExceptionResponse response  = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),System.currentTimeMillis(),errors.get(0));
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserCustomException.class)
    public final ResponseEntity<Object> handleInvalidUserException(UserCustomException ex, WebRequest request){
        ExceptionResponse response  = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),System.currentTimeMillis(),ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(OwnerCustomException.class)
    public final ResponseEntity<Object> handleInvalidOwnerException(OwnerCustomException ex, WebRequest request){
        ExceptionResponse response  = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),System.currentTimeMillis(),ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ParamException.class)
    public final ResponseEntity<Object> handleInvalidInputException(ParamException ex, WebRequest request){
        ExceptionResponse response  = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),System.currentTimeMillis(),ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(Exception ex, WebRequest request){
        ExceptionResponse response  = new ExceptionResponse(HttpStatus.NOT_FOUND.value(),System.currentTimeMillis(),ex.getMessage());
        return new ResponseEntity(response,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RentException.class)
    public final ResponseEntity<Object> handleRentException(RentException ex, WebRequest request){
        ExceptionResponse response  = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),System.currentTimeMillis(),ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}



