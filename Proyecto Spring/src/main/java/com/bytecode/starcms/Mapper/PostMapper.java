package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.starcms.Models.Post;

public class PostMapper implements RowMapper<Post>{

	@Override
	public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
     
		Post post = new Post();
		
		post.setExtracto(rs.getString("Extracto"));
		post.setFecha(rs.getDate("Fecha"));
		post.setIdCategoria(rs.getInt("IdCategoria"));
		post.setIdPost(rs.getInt("IdPost"));
		post.setIdUsuario(rs.getInt("IdUsuario"));
		post.setImagenDestacada(rs.getString("ImagenDestacada"));
		post.setSlug(rs.getString("Slug"));
		post.setTipo(rs.getString("Tipo"));
		post.setTitulo(rs.getString("Titulo"));
		
    
		return post;
	}

}
