package com.userservice.expetions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1266768541625964634L;

	public ResourceNotFoundException() {
		super("Resource Not Found On Server");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	
}
