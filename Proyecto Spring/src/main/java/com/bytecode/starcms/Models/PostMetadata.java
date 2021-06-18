package com.bytecode.starcms.Models;

import java.sql.Date;

public class PostMetadata {
	
private long IdPostMetadata;
	
	private long IdPost;
	
	private String Clave;
	
	private String Valor;
	
	private String Tipo;

	private Date Fecha;
	
	public PostMetadata() {
		
	}
	

	public PostMetadata(long idPostMetadata, long idPost, String clave, String valor, String tipo, Date fecha) {
		super();
		IdPostMetadata = idPostMetadata;
		IdPost = idPost;
		Clave = clave;
		Valor = valor;
		Tipo = tipo;
		Fecha = fecha;
	}


	public long getIdPostMetadata() {
		return IdPostMetadata;
	}

	public void setIdPostMetadata(long idPostMetadata) {
		IdPostMetadata = idPostMetadata;
	}

	public long getIdPost() {
		return IdPost;
	}

	public void setIdPost(long idPost) {
		IdPost = idPost;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
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
