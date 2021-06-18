package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.starcms.Models.GrupoPermiso;

public class GrupoPermisoMapper implements RowMapper<GrupoPermiso> {

	@Override
	public GrupoPermiso mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		GrupoPermiso grupoPermiso = new GrupoPermiso();
		grupoPermiso.setIdGrupo(rs.getInt("IdGrupo"));
		grupoPermiso.setFecha(rs.getDate("Fecha"));
		grupoPermiso.setIdPermiso(rs.getInt("IdPermiso"));
		grupoPermiso.setIdGrupoPermiso(rs.getInt("IdGrupoPermiso"));
		
		return grupoPermiso; 
	}

}
