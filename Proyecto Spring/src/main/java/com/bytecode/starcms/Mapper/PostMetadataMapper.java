


package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bytecode.starcms.Models.PostMetadata;

public class PostMetadataMapper implements RowMapper<PostMetadata> {

	@Override
	public PostMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PostMetadata postMetadata = new PostMetadata();
		
		postMetadata.setClave(rs.getString("Clave"));
		postMetadata.setFecha(rs.getDate("Fecha"));
		postMetadata.setIdPost(rs.getInt("IdPost"));
		postMetadata.setIdPostMetadata(rs.getInt("IdPostMetadata"));
		postMetadata.setTipo(rs.getString("Tipo"));
		postMetadata.setValor(rs.getString("Valor"));
		
		return postMetadata;
	}

}
