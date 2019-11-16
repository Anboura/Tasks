package com.tasks.api.enumeration;
public enum ApiResourceName {
	TASK("Task");
	private String value;

	ApiResourceName(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
