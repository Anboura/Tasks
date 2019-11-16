package com.tasks.api.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Task {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String label;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	@ManyToOne()
	@JoinColumn(name="priority_id")
	private Priority priority;
	@OneToMany(mappedBy = "task")
	private List<TaskStatus> taskStatusList;
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(final LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(final LocalDate endDate) {
		this.endDate = endDate;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(final Priority priority) {
		this.priority = priority;
	}
	public List<TaskStatus> getTaskStatusList() {
		return taskStatusList;
	}
	public void setTaskStatusList(final List<TaskStatus> taskStatusList) {
		this.taskStatusList = taskStatusList;
	}
	
	
	
	
}
