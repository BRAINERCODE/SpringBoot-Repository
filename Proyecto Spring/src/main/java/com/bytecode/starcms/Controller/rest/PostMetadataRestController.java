package com.bytecode.starcms.Controller.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytecode.starcms.Models.PostMetadata;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.PostMetadataRepository;

@RestController
@RequestMapping("/api/v1/pmetadata")
public class PostMetadataRestController {

	private PostMetadataRepository _postMetadataRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody PostMetadata postmetadata)
	{
		return ResponseEntity.ok(new RepBase(_postMetadataRepository.Save(postmetadata)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody PostMetadata postmetadata)
	{
		return ResponseEntity.ok(new RepBase(_postMetadataRepository.Update(postmetadata)));
	}
	@GetMapping
	public ResponseEntity<List<PostMetadata>> FindAll(@RequestBody PostMetadata postmetadata)
	{
		return ResponseEntity.ok(_postMetadataRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<PostMetadata> FindById(@PathVariable int id)
	{
		return ResponseEntity.ok(_postMetadataRepository.findById(id));
	}
}