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

import com.example.demo.models.Location;
import com.example.demo.models.People;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
		
	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.findAll();
	}
		
	@GetMapping("/locations/{id}")
	public Optional<Location> getLocationById(@PathVariable Integer id) {
		return locationService.findById(id);
	}
	
	@GetMapping("/location/{id}/peoples")
	public List<People> GetUsersByLocation(@PathVariable Integer id) {
	    Optional<Location> location = locationService.findById(id);		
	    if(location.isPresent()) {
		return location.get().getPeoples();
	    }		
	    return null;
	}
	
	@PostMapping("/locations/addNew")
	public void AddLocation(@RequestBody Location location) {
	    locationService.addLocation(location);
	}
	
	@PutMapping("/location/{id}/update")
	public void UpdateLocation(@RequestBody Location location) {
		locationService.updateLocation(location);
	}
	
	@DeleteMapping("/location/{id}/delete")
	public void deleteLocation(@PathVariable Integer id) {
	     locationService.deleteLocation(id);
	}

}
