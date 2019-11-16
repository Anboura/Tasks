
package com.tasks.api.exception;
public class ApiBadRequestException extends Exception {

	private static final long serialVersionUID = -5757943495120905436L;

	public ApiBadRequestException() {
		super();
	}

	public ApiBadRequestException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ApiBadRequestException(String message) {
		super(message);
	}

	public ApiBadRequestException(Throwable throwable) {
		super(throwable);
	}

}
