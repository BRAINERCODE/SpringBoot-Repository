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

import com.bytecode.starcms.Models.Comentario;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.ComentarioRepository;

@RestController
@RequestMapping("/api/v1/comentario")
public class ComentarioRestController {

	@Autowired
	private  ComentarioRepository _comentarioRepository;
	 
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody Comentario comentario){
		return ResponseEntity.ok(new RepBase(_comentarioRepository.Save(comentario)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Comentario comentario){
		return ResponseEntity.ok(new RepBase(_comentarioRepository.Update(comentario)));
	}
	@GetMapping
	public ResponseEntity<List<Comentario>> FindAll(){
		return ResponseEntity.ok(_comentarioRepository.findAll());
	}
	@GetMapping({"id"})
	public ResponseEntity<Comentario> FindAll(@PathVariable int id){
		return ResponseEntity.ok(_comentarioRepository.findById(id));
	}
}
