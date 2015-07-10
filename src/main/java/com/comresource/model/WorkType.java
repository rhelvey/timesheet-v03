package com.comresource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="TimeSheet")
public class WorkType {
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Long id; 
	
	@Range(min = 1, max = 12)
	@Column(name="HOURS")
	private int hours;

	@NotNull
	@Column(name="JOB_TYPE")
	private String activity;
	

	
	public String getActivity() {
		return activity;
	}


	public Long getId() {
		return id;
	}
	
	public int getHours() {
		return hours;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
}
