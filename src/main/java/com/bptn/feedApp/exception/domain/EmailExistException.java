package com.bptn.feedApp.exception.domain;

public class EmailExistException extends RuntimeException {

	public EmailExistException(String message) {
		super(message);
		
	}

	private static final long serialVersionUID = 1L;

}
