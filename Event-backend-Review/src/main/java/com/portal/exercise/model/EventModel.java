package com.portal.exercise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="event")
public class EventModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String eventname;
	private String eventtype;
	private String eventbudget;
	private String eventstatus;
	private String eventcapacity;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getEventbudget() {
		return eventbudget;
	}
	public void setEventbudget(String eventbudget) {
		this.eventbudget = eventbudget;
	}
	public String getEventstatus() {
		return eventstatus;
	}
	public void setEventstatus(String eventstatus) {
		this.eventstatus = eventstatus;
	}
	public String getEventcapacity() {
		return eventcapacity;
	}
	public void setEventcapacity(String eventcapacity) {
		this.eventcapacity = eventcapacity;
	}

	

	
}
