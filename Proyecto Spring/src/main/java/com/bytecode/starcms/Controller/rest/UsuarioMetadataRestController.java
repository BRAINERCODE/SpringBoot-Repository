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
import com.bytecode.starcms.Models.UsuarioMetadata;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.UsuarioMetadataRepository;



@RestController
@RequestMapping("api/v1/usuariometadata")
public class UsuarioMetadataRestController 
{
	@Autowired
	private UsuarioMetadataRepository _usuarioMetadataRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody UsuarioMetadata usuariometadata ){
		
		return ResponseEntity.ok(new RepBase(_usuarioMetadataRepository.Save(usuariometadata)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody UsuarioMetadata usuariometadata ){
		
		return ResponseEntity.ok(new RepBase(_usuarioMetadataRepository.Update(usuariometadata)));
	}
	@GetMapping
	public ResponseEntity<List<UsuarioMetadata>> FindAll(){
		
		return ResponseEntity.ok(_usuarioMetadataRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<UsuarioMetadata> FindById(@PathVariable int id)
	{
		return ResponseEntity.ok(_usuarioMetadataRepository.findById(id));
	}
}
