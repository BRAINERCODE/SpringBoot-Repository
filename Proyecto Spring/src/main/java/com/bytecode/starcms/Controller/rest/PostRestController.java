package com.bytecode.starcms.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bytecode.starcms.Models.Post;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.PostRepository;

@RestController
@RequestMapping("/api/v1/post")
public class PostRestController {

	@Autowired
	private PostRepository _postRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody Post post ){
		
		return ResponseEntity.ok(new RepBase(_postRepository.Save(post)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Post post ){
		
		return ResponseEntity.ok(new RepBase(_postRepository.Update(post)));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Post>> FindAll(){
		
		return ResponseEntity.ok(_postRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<Post> FindById(@PathVariable int id)
	{
		return ResponseEntity.ok(_postRepository.findById(id));
	}
	
}
