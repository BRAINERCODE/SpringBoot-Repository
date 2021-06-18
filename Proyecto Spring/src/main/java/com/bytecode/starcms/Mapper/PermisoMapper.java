package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.starcms.Models.Permiso;

public class PermisoMapper implements RowMapper<Permiso>{

	@Override
	public Permiso mapRow(ResultSet rs, int rowNum) throws SQLException {
		Permiso permiso = new Permiso();
		
		permiso.setIdPermiso(rs.getInt("IdPermiso"));
		permiso.setNombre(rs.getString("Nombre"));
		permiso.setFecha(rs.getDate("Fecha"));
		
		return permiso;
	}

}
