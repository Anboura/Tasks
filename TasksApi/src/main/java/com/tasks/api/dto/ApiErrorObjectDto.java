package com.tasks.api.dto;

import java.util.Date;

public class ApiErrorObjectDto {
	private String message;
	private String detail;
	private int status;
	private Date timeStamp;
	
	private ApiErrorObjectDto(final Builder builder) {
		this.message = builder.getMessage();
		this.detail = builder.getDetail();
		this.status = builder.getStatus();
		this.timeStamp = builder.getTimeStamp();
	}
	
	public ApiErrorObjectDto(String message, String detail, int status) {
		
	}
	public String getMessage() {
		return message;
	}
	public String getDetail() {
		return detail;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public static class Builder {
		private String message;
		private String detail;
		private int status;
		private Date timeStamp;
		
		public Builder message(final String message) {
			this.message = message;
			return this;
		}
		public Builder detail(final String detail) {
			this.detail = detail;
			return this;
		}
		public Builder timeStamp() {
			this.timeStamp = new Date(System.currentTimeMillis());
			return this;
		}
		
		public Builder status(final int status) {
			this.status = status;
			return this;
		}
		public String getMessage() {
			return message;
		}
		public String getDetail() {
			return detail;
		}
		public Date getTimeStamp() {
			return timeStamp;
		}
		public int getStatus() {
			return status;
		}
		
		public ApiErrorObjectDto build() {
			return new ApiErrorObjectDto(this);
		}
		
	}
}
