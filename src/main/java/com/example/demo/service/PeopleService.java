package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.People;
import com.example.demo.repository.PeopleRepository;

@Service
public class PeopleService {
	
	@Autowired
	PeopleRepository peopleRepository;

	public List<People> getAllPeople() {
		// TODO Auto-generated method stub
		return (List<People>)peopleRepository.findAll();
	}

	public Optional<People> findById(Integer id) {
		// TODO Auto-generated method stub
		return peopleRepository.findById(id);
	}
	
	public List<People> getPeoplesByLocation(Integer id) {
	    return peopleRepository.findByLocationId(id);
	}
	
	public void addPeople(People people) {
		peopleRepository.save(people);
	}

	public void updatePeople(People people) {
		// TODO Auto-generated method stub
		peopleRepository.save(people);
		
	}

	public void deletePeople(Integer id) {
		// TODO Auto-generated method stub
		peopleRepository.deleteById(id);
		
	}

}
