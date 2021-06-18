package com.bytecode.starcms.Controller.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bytecode.starcms.Models.Grupo;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.GrupoRepository;

@RequestMapping("/api/v1/grupo")
public class GrupoRestController {

	private GrupoRepository _grupoRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody Grupo grupo)
	{
		return ResponseEntity.ok(new RepBase(_grupoRepository.Save(grupo)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Grupo grupo)
	{
		return ResponseEntity.ok(new RepBase(_grupoRepository.Update(grupo)));
	}
	@GetMapping
	public ResponseEntity<List<Grupo>> FindAll()
	{
		return ResponseEntity.ok(_grupoRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<Grupo> FindById(@PathVariable int id)
	{
		return ResponseEntity.ok(_grupoRepository.findById(id));
	}
}
