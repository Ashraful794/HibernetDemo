package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.models.Image;
import com.example.demo.service.ImageService;

@RestController
public class ImageController
{
	
	@Autowired
	ImageService imageService;
	
	@PostMapping("/image/addNew/userid/{id}")
	public void addPost(@RequestParam("file") MultipartFile file,@PathVariable Integer id) throws Exception
	{
		imageService.uploadImage(file,id);
	}
	
	@GetMapping("/images")
	public List<Image> getAllImage() {
	    return imageService.findAll();
	}


}
