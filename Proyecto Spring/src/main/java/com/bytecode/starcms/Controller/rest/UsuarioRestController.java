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

import com.bytecode.starcms.Models.Usuario;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.UsuarioRepository;


@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioRestController {

	@Autowired
	private UsuarioRepository _usuarioRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save(@RequestBody Usuario usuario){
		
		return ResponseEntity.ok(new RepBase(_usuarioRepository.Save(usuario)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Usuario usuario ){
		
		return ResponseEntity.ok(new RepBase(_usuarioRepository.Update(usuario)));
	}
	@GetMapping
	public ResponseEntity<List<Usuario>> FindAll(){
		
		return ResponseEntity.ok(_usuarioRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<Usuario> FindById(@PathVariable int id)
	{
		return ResponseEntity.ok(_usuarioRepository.findById(id));
	}
}
