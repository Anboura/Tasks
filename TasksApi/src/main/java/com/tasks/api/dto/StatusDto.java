package com.tasks.api.dto;

public class StatusDto {
	private int id;
	private String label;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(final String label) {
		this.label = label;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "StatusDto [id=" + id + ", label=" + label + ", date=" + date + "]";
	}
	
}
