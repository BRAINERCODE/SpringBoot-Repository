package com.bytecode.starcms.Models;

import java.sql.Date;

public class UsuarioMetadata {

	private long IdUsuarioMetadata;

	private long IdUsuario;

	private String Clave;

	private String Valor;

	private String Tipo;

	private Date Fecha;

	public UsuarioMetadata() {

	}
	

	public UsuarioMetadata(long idUsuarioMetadata, long idUsuario, String clave, String valor, String tipo,
			Date fecha) {
		super();
		IdUsuarioMetadata = idUsuarioMetadata;
		IdUsuario = idUsuario;
		Clave = clave;
		Valor = valor;
		Tipo = tipo;
		Fecha = fecha;
	}


	public long getIdUsuarioMetadata() {
		return IdUsuarioMetadata;
	}

	public void setIdUsuarioMetadata(long idUsuarioMetadata) {
		IdUsuarioMetadata = idUsuarioMetadata;
	}

	public long getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		IdUsuario = idUsuario;
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