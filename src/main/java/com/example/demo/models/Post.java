package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post {
	
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="peopleid",insertable=false, updatable=false)
	private People people;
	
	private Integer peopleid;
	
	
	public Integer getPeopleid() {
		return peopleid;
	}

	public void setPeopleid(Integer peopleid) {
		this.peopleid = peopleid;
	}

	private String details;
	
	public Post() {}

	public Post(Integer id, People people, String details) {
		super();
		this.id = id;
		this.people = people;
		this.details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	};
	
	@JsonBackReference
	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
	
	

}
