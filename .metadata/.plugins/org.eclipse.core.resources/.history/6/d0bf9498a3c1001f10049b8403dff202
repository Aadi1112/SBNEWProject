package com.aadi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public String handleAe(Exception e) {
		
		return "errorPage";
		
	}
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleAe(NullPointerException e) {
//		
//		return "errorPage";
//		
//	}
}
