package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String pathname;
	
	@ManyToOne
	@JoinColumn(name="peopleid",insertable=false, updatable=false)
	private People people;

	private Integer peopleid;
	
	public Image() {};
	
	public Image(Integer id, String pathname,People people) {
		super();
		this.id = id;
		this.pathname = pathname;
		this.people = people;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPathName() {
		return pathname;
	}

	public void setPathName(String pathname) {
		this.pathname = pathname;
	}

	@JsonBackReference
	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Integer getPeopleid() {
		return peopleid;
	}

	public void setPeopleid(Integer peopleid) {
		this.peopleid = peopleid;
	}

	

}
