package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.starcms.Models.Categoria;

public class CategoriaMapper implements RowMapper<Categoria> {
	

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria categoria = new Categoria();
		categoria.setCategoriaSuperior(rs.getInt("CategoriaSuperior"));
		categoria.setDescripcion(rs.getString("Descripcion"));
		categoria.setFecha(rs.getDate("Fecha"));
		categoria.setIdCategoria(rs.getInt("IdCategoria"));
		categoria.setNombre(rs.getString("Nombre"));
		

		return categoria;
	}
	
}
