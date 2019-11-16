package com.tasks.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String label;
	
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
}
