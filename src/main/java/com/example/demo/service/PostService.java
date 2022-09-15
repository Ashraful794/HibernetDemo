package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Post;
import com.example.demo.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public List<Post> findAll() {
		return (List<Post>)postRepository.findAll();
	}

	public Optional<Post> findById(Integer id) {
		return postRepository.findById(id);
	}
	
	public List<Post> getPostsByPeopleId(Integer id) {
	    return postRepository.findByPeopleId(id);
	}

	public void addPost(Post post) {
		// TODO Auto-generated method stub
		postRepository.save(post);		
	}

	public void updatePost(Post post) {
		// TODO Auto-generated method stub
		postRepository.save(post);
		
	}

	public void deletePost(Integer id) {
		// TODO Auto-generated method stub
		 postRepository.deleteById(id);
	}

}
