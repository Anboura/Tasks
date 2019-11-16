package com.tasks.api.entity;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
@Entity
@Table(name="task_status")
public class TaskStatus {
	@EmbeddedId
	private TaskStatusKey id;
	@ManyToOne
	@MapsId("task_id")
	@JoinColumn(name ="task_id")
	private Task task;
	@ManyToOne
	@MapsId("status_id")
	@JoinColumn(name ="status_id")
	private Status status;
	private LocalDate date;

	public Task getTask() {
		return task;
	}

	public void setTask(final Task task) {
		this.task = task;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(final Status status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(final LocalDate date) {
		this.date = date;
	}

	public TaskStatusKey getId() {
		return id;
	}

	public void setId(final TaskStatusKey id) {
		this.id = id;
	}

}
