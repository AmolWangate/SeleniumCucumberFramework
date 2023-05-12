package com.cucumber.customexception;

public class InvalidKeyException extends FrameworkException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidKeyException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidKeyException(String message) {
		super(message);
	}

}
