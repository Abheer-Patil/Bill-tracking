package com.Bill_track.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globalexcep 
{
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> globalexception()
	{
		return new ResponseEntity("Error Please try again by checking with correct values", HttpStatus.BAD_REQUEST);
	}
	
}