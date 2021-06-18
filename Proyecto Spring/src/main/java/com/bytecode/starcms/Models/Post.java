package com.bytecode.starcms.Models;

import java.sql.Date;

public class Post {

private long IdPost;
	
	private String Titulo;
	
	private String Slug;
	
	private String Extracto;
	
	private long  IdUsuario = 1;
	
	private long IdCategoria;
	
	private String ImagenDestacada;
	
	private String Tipo = "POST";

	private Date Fecha;
	
	
	public Post() {
		
	}

	

	public Post(long idPost, String titulo, String slug, String extracto, long idUsuario, long categoria,
			String imagenDestacada, String tipo, Date fecha) {
		super();
		IdPost = idPost;
		Titulo = titulo;
		Slug = slug;
		Extracto = extracto;
		IdUsuario = idUsuario;
		IdCategoria = categoria;
		ImagenDestacada = imagenDestacada;
		Tipo = tipo;
		Fecha = fecha;
	}



	public long getIdPost() {
		return IdPost;
	}


	public void setIdPost(long idPost) {
		IdPost = idPost;
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public String getSlug() {
		return Slug;
	}


	public void setSlug(String slug) {
		Slug = slug;
	}


	public String getExtracto() {
		return Extracto;
	}


	public void setExtracto(String extracto) {
		Extracto = extracto;
	}


	public long getIdUsuario() {
		return IdUsuario;
	}


	public void setIdUsuario(long idUsuario) {
		IdUsuario = idUsuario;
	}


	public long getIdCategoria() {
		return IdCategoria;
	}


	public void setIdCategoria(long categoria) {
		IdCategoria = categoria;
	}


	public String getImagenDestacada() {
		return ImagenDestacada;
	}


	public void setImagenDestacada(String imagenDestacada) {
		ImagenDestacada = imagenDestacada;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	public Date getFecha() {
		return Fecha;
	}


	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	
}
