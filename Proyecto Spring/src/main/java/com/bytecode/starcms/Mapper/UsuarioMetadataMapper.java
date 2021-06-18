package com.bytecode.starcms.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.bytecode.starcms.Models.UsuarioMetadata;

public class UsuarioMetadataMapper implements RowMapper<UsuarioMetadata>{

	@Override
	public UsuarioMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioMetadata usuarioMetadata = new UsuarioMetadata();
		
		usuarioMetadata.setClave(rs.getString("Clave"));
		usuarioMetadata.setFecha(rs.getDate("Fecha"));
		usuarioMetadata.setIdUsuario(rs.getInt("IdUsuario"));
		usuarioMetadata.setIdUsuarioMetadata(rs.getInt("IdUsuarioMetadata"));
		usuarioMetadata.setTipo(rs.getString("Tipo"));
		usuarioMetadata.setValor(rs.getString("Valor"));
		
		return usuarioMetadata;
	}



}
