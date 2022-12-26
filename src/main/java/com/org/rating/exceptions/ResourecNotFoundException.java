package com.org.rating.exceptions;

public class ResourecNotFoundException extends RuntimeException {
	
	public ResourecNotFoundException(String s) {
		super(s);
	}
	
	public ResourecNotFoundException() {
		super("Resource not found");
	}

}
