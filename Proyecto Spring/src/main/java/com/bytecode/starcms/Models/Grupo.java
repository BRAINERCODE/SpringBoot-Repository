package com.bytecode.starcms.Models;

public class Grupo {

	private long IdGrupo;
	private String Nombre;
	
	public Grupo() {
		
	}
	
	public Grupo(long idGrupo, String nombre) {
		super();
		IdGrupo = idGrupo;
		Nombre = nombre;
	}
	public long getIdGrupo() {
		return IdGrupo;
	}
	public void setIdGrupo(int idGrupo) {
		IdGrupo = idGrupo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}	 
}
