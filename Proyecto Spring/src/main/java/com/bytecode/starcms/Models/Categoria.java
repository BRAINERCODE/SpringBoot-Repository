package com.bytecode.starcms.Models;

import java.sql.Date;

public class Categoria 
{
	private long IdCategoria;
	private String Nombre;
	private String Descripcion;
	private Date Fecha;
	private int CategoriaSuperior;
	
	public Categoria() 
	{
		
	}
	
	

	public Categoria(long idCategoria, String nombre, String descripcion, Date fecha, int categoriaSuperior) {
		super();
		IdCategoria = idCategoria;
		Nombre = nombre;
		Descripcion = descripcion;
		Fecha = fecha;
		CategoriaSuperior = categoriaSuperior;
	}



	public long getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public int getCategoriaSuperior() {
		return CategoriaSuperior;
	}

	public void setCategoriaSuperior(int categoriaSuperior) {
		CategoriaSuperior = categoriaSuperior;
	}
	
	
	
}
