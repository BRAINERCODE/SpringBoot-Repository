package com.bytecode.starcms.Models;

import java.sql.Date;

public class GrupoPermiso {

	private long IdGrupo;
	private long IdPermiso;
	private long IdGrupoPermiso;
	private Date Fecha; 
	
	
	
	public GrupoPermiso() {
		
	}



	public GrupoPermiso(long idGrupo, long idPermiso, long idGrupoPermiso, Date fecha) {
		super();
		IdGrupo = idGrupo;
		IdPermiso = idPermiso;
		IdGrupoPermiso = idGrupoPermiso;
		Fecha = fecha;
	}



	public long getIdGrupo() {
		return IdGrupo;
	}



	public void setIdGrupo(long idGrupo) {
		IdGrupo = idGrupo;
	}



	public long getIdPermiso() {
		return IdPermiso;
	}



	public void setIdPermiso(long idPermiso) {
		IdPermiso = idPermiso;
	}



	public long getIdGrupoPermiso() {
		return IdGrupoPermiso;
	}



	public void setIdGrupoPermiso(long idGrupoPermiso) {
		IdGrupoPermiso = idGrupoPermiso;
	}



	public Date getFecha() {
		return Fecha;
	}



	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	
	
	
}
