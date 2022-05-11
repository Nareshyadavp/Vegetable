package com.emart.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BadRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequestException(String message) {
		super(message);
	}
}