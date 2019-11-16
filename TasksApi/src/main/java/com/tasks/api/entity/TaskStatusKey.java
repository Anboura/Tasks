package com.tasks.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TaskStatusKey implements Serializable {
	private static final long serialVersionUID = 8710174115811306307L;
	@Column(name="task_id")
	private int taskId;
	@Column(name="status_id")
	private int statusId;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(final int taskId) {
		this.taskId = taskId;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(final int statusId) {
		this.statusId = statusId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + statusId;
		result = prime * result + taskId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskStatusKey other = (TaskStatusKey) obj;
		if (statusId != other.statusId)
			return false;
		if (taskId != other.taskId)
			return false;
		return true;
	}
	
	
}
