package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.People;
import com.example.demo.models.Post;
import com.example.demo.service.PeopleService;

@RestController
public class PeopleController {
	
	@Autowired
	private PeopleService peopleService;
	
	
	@GetMapping("/peoples")
	public List<People> getAllPeople()
	{
		return peopleService.getAllPeople();
	}
	@GetMapping("/people/{id}")
	public Optional<People> getPeopleById(@PathVariable Integer id)
	{
		return peopleService.findById(id);
	}
	
	
	@GetMapping("/people/{id}/posts")
	public List<Post> getPostsByUser(@PathVariable Integer id) {
		
	    Optional<People> people = peopleService.findById(id);
	    if(people.isPresent()) {
	    	return people.get().getPosts();
	    }
	    return null;
	}
	
	@GetMapping("/peoples/location/{id}/peoples")
	public List<People> getUsersByLocation(@PathVariable Integer id) {
	    return peopleService.getUsersByLocation(id);
	}
	
	@PostMapping("/peoples/addNew")
	public void AddUser(@RequestBody People people) {
	    peopleService.addPeople(people);
	}
	
	@PutMapping("/people/{id}/update")
	public void updatePeople(@RequestBody People people ) {
		peopleService.updatePeople(people);
	}
	
	@DeleteMapping("/people/{id}/delete")
	public void deletePeople(@PathVariable Integer id) {
		peopleService.deletePeople(id);
	}
	

}
