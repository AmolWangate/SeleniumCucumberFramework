package com.cucumber.customexception;

public class InputOutputException extends FrameworkException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InputOutputException(String message, Throwable cause) {
		super(message, cause);
	}

	public InputOutputException(String message) {
		super(message);
	}

}
