package com.tasks.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tasks.api.dto.ApiErrorObjectDto;
import com.tasks.api.exception.ApiResourceNotFoundException;


@ControllerAdvice
public class CustomExceptionHandlerController extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ApiErrorObjectDto> resourceNotFound(final ApiResourceNotFoundException exception) {
		final ApiErrorObjectDto errorObject = new ApiErrorObjectDto.Builder().message(exception.getMessage())
				.status(HttpStatus.NOT_FOUND.value()).timeStamp().build();
		return new ResponseEntity<ApiErrorObjectDto>(errorObject, HttpStatus.NOT_FOUND);
	}

}
