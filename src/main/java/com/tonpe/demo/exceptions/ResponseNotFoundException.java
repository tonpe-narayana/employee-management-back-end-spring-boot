package com.tonpe.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResponseNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	public ResponseNotFoundException(String message) {
		super(message);
	}

}
