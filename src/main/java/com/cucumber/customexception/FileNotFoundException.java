package com.cucumber.customexception;

public class FileNotFoundException extends FrameworkException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public FileNotFoundException(String message) {
		super(message);
	}

}
