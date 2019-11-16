package com.tasks.api.exception;

public class ApiResourceAlradyExistException extends Exception {

	private static final long serialVersionUID = 770705878570411586L;

	public ApiResourceAlradyExistException() {
		super();
	}

	public ApiResourceAlradyExistException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ApiResourceAlradyExistException(String message) {
		super(message);
	}

	public ApiResourceAlradyExistException(Throwable throwable) {
		super(throwable);
	}

}
