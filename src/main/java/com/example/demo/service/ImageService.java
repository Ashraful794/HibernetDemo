package com.example.demo.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.models.Image;
import com.example.demo.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	ImageRepository imageRepository; 
	
	public void uploadImage(MultipartFile file,Integer id)throws Exception
	
	{
		// TODO Auto-generated method stub
		
		try
		{
			String Path_Directory="E:\\Problem Solving New\\HibernetDemo\\src\\main\\resources\\static\\image";
//			String Path_Directory=new ClassPathResource("/image").getFile().getAbsolutePath();
			Files.copy(file.getInputStream(), Paths.get(Path_Directory+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			Image image=new Image();
			
			image.setPathName(Path_Directory+file.getOriginalFilename());
			image.setPeopleid(id);
			
			imageRepository.save(image);
			
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

	public List<Image> findAll() {
		// TODO Auto-generated method stub
		return imageRepository.findAll();
	}
}
