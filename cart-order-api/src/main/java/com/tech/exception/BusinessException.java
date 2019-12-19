package com.tech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BusinessException(String exception) {
		super(exception);
	}
	
}