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

import com.bytecode.starcms.Models.GrupoPermiso;
import com.bytecode.starcms.Models.common.RepBase;
import com.bytecode.starcms.Repository.GrupoPermisoRepository;

@RestController
@RequestMapping("/api/v1/GPermiso")
public class GrupoPermisoRestController {

	private GrupoPermisoRepository _grupoPermisoRepository;
	
	@PutMapping
	public ResponseEntity<RepBase> Save (@RequestBody GrupoPermiso grupoPermiso)
	{
		return ResponseEntity.ok(new RepBase(_grupoPermisoRepository.Save(grupoPermiso)));
	}
	@PostMapping
	public ResponseEntity<RepBase> Update (@RequestBody GrupoPermiso grupoPermiso)
	{
		return ResponseEntity.ok(new RepBase(_grupoPermisoRepository.Update(grupoPermiso)));
	}
	@GetMapping
	public ResponseEntity<List<GrupoPermiso>> FindAll ()
	{
		return ResponseEntity.ok(_grupoPermisoRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<GrupoPermiso> FindById (@PathVariable int id)
	{
		return ResponseEntity.ok(_grupoPermisoRepository.findById(id));
	}
	
}
