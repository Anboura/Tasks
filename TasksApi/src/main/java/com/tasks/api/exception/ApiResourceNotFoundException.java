package com.tasks.api.exception;

public class ApiResourceNotFoundException extends Exception {
	private static final long serialVersionUID = 7623435673792432364L;

	public ApiResourceNotFoundException() {
		super();
	}

	public ApiResourceNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ApiResourceNotFoundException(String message) {
		super(message);
	}

	public ApiResourceNotFoundException(Throwable throwable) {
		super(throwable);
	}

}
