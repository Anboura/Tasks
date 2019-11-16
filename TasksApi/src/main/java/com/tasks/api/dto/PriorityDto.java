package com.tasks.api.dto;

public class PriorityDto {
	private int id;
	private String label;
	private int level;

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

	public int getLevel() {
		return level;
	}

	public void setLevel(final int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "PriorityDto [id=" + id + ", label=" + label + ", level=" + level + "]";
	}

}
