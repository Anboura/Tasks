package com.tasks.api.enumeration;

public enum ResourceErrorType {
	NOT_FOUND("NOT_FOUND"), ALRADY_EXIST("ALRADY_EXIST");
	private String value = "";

	ResourceErrorType(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}
}
