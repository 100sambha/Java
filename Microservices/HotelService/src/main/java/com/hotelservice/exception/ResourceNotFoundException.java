package com.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5913703658164244077L;


	public ResourceNotFoundException() {
		super("Resource Not Found");
	}


	public ResourceNotFoundException(String message) {
		super(message);
	}	
}
