package com.bytecode.starcms.Models;

import java.sql.Date;

public class Permiso {

	private long IdPermiso;

	private String Nombre;

	private Date Fecha;

	public Permiso() {

	}
	

	public Permiso(long idPermiso, String nombre, Date fecha) {
		super();
		IdPermiso = idPermiso;
		Nombre = nombre;
		Fecha = fecha;
	}


	public long getIdPermiso() {
		return IdPermiso;
	}

	public void setIdPermiso(long idPermiso) {
		IdPermiso = idPermiso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	
}
