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

import com.bytecode.starcms.Models.Categoria;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.CategoriaRepository;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaRestController {

	@Autowired
	private CategoriaRepository _CategoriaRepository; 
	
	@PutMapping
	public ResponseEntity<RepBase> save(@RequestBody Categoria categoria){
		return ResponseEntity.ok(new RepBase(_CategoriaRepository.Save(categoria)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Categoria categoria){
		return ResponseEntity.ok(new RepBase(_CategoriaRepository.Update(categoria)));
	}
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		return ResponseEntity.ok(_CategoriaRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<Categoria> findById(@PathVariable int id){
		return ResponseEntity.ok(_CategoriaRepository.findById(id));
	}
}
