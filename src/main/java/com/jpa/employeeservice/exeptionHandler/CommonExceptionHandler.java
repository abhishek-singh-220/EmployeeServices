package com.jpa.employeeservice.exeptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> handleInternalServerExp(Exception ex, WebRequest request){
		ApiError errorResponse=new ApiError(ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ApiError>(errorResponse, HttpStatus.NOT_FOUND);
		
	}

}
