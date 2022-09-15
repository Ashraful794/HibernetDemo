package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Location;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository; 

	public List<Location> findAll() {
		return (List<Location>) locationRepository.findAll();
	}

	public Optional<Location> findById(Integer id) {
		return locationRepository.findById(id);
	}
	
	public void addLocation(Location location) {
	     locationRepository.save(location);
	}

	public void updateLocation(Location location) {
		// TODO Auto-generated method stub
		locationRepository.save(location);
	}

	public void deleteLocation(Integer id) {
		// TODO Auto-generated method stub
		locationRepository.deleteById(id);
		
	}
	
	

}
