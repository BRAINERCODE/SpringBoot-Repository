package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.starcms.Models.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Usuario usuario = new Usuario();
		usuario.setApellido(rs.getString("Apellido"));
		usuario.setContraseña(rs.getString("Contraseña"));
		usuario.setCorreo(rs.getString("Correo"));
		usuario.setFecha(rs.getDate("Fecha"));
		usuario.setIdGrupo(rs.getInt("IdGrupo"));
		usuario.setIdUsuario(rs.getInt("IdUsuario"));
		usuario.setNombre(rs.getString("Nombre"));
		
		
		return null;
	}

}
