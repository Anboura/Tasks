package com.tasks.api.dto;

import java.util.List;

public class TaskDto {
	private int id;
	private String label;
	private String startDate;
	private String endDate;
	private String effectiveEndDate;
	private List<StatusDto> statusList;
	private PriorityDto priority;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEffectiveEndDate() {
		return effectiveEndDate;
	}
	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}
	public List<StatusDto> getStatusList() {
		return statusList;
	}
	public void setStatusList(List<StatusDto> statusList) {
		this.statusList = statusList;
	}
	public PriorityDto getPriority() {
		return priority;
	}
	public void setPriority(PriorityDto priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "TaskDto [id=" + id + ", label=" + label + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", effectiveEndDate=" + effectiveEndDate + ", statusList=" + statusList + ", priority=" + priority
				+ "]";
	}

	
	
}
