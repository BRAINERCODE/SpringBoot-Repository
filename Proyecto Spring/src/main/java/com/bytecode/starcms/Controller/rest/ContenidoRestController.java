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

import com.bytecode.starcms.Models.Contenido;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.ContenidoRepository;

@RestController
@RequestMapping("/api/v1/contenido")
public class ContenidoRestController {

	@Autowired
	 private  ContenidoRepository _contenidoRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody Contenido contenido){
		return ResponseEntity.ok(new RepBase(_contenidoRepository.Save(contenido)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Contenido contenido){
		return ResponseEntity.ok(new RepBase(_contenidoRepository.Update(contenido)));
	}
	@GetMapping
	public ResponseEntity<List<Contenido>> FindAll(){
		return ResponseEntity.ok(_contenidoRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<Contenido> FindByID(@PathVariable int id){
		return ResponseEntity.ok(_contenidoRepository.findById(id));
	}
}
