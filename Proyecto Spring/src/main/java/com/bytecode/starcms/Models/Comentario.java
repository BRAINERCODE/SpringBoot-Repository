package com.bytecode.starcms.Models;

import java.sql.Date;

public class Comentario {

	private String Comentario;
	private Date Fecha;
	private long IdComentario;
	private long IdPost;
	private long IdUsuario;
	private long Respuesta;
	

	public Comentario() {
		
		
	}
	
	public Comentario(String comentario, Date fecha, long idComentario, long idPost, long idUsuario, long respuesta) {
		super();
		Comentario = comentario;
		Fecha = fecha;
		IdComentario = idComentario;
		IdPost = idPost;
		IdUsuario = idUsuario;
		Respuesta = respuesta;
	}
	public String getComentario() {
		return Comentario;
	}
	public void setComentario(String comentario) {
		Comentario = comentario;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public long getIdComentario() {
		return IdComentario;
	}
	public void setIdComentario(int idComentario) {
		IdComentario = idComentario;
	}
	public long getIdPost() {
		return IdPost;
	}
	public void setIdPost(int idPost) {
		IdPost = idPost;
	}
	public long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public long getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(int respuesta) {
		Respuesta = respuesta;
	}
	
	
}
