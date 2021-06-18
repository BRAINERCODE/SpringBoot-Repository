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

import com.bytecode.starcms.Models.Permiso;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.PermisoRepository;

@RestController
@RequestMapping("/api/v1/permiso")
public class PermisoRestController {

	@Autowired
	private PermisoRepository _permisoRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> save(@RequestBody Permiso permiso) {
		
		return ResponseEntity.ok(new RepBase(_permisoRepository.Save(permiso)));
	}
	
	@PostMapping
	public ResponseEntity<RepBase> Update(@RequestBody Permiso permiso) {
		
		return ResponseEntity.ok(new RepBase(_permisoRepository.Update(permiso)));
	}
	
	  @GetMapping
	    public ResponseEntity<List<Permiso>> findAll(){
	        return ResponseEntity.ok(_permisoRepository.findAll());
	    }
	
	@GetMapping("/{id}")
	public ResponseEntity<Permiso> findById(@PathVariable int id)
	{
		return ResponseEntity.ok(_permisoRepository.findById(id));
	}
	
}
