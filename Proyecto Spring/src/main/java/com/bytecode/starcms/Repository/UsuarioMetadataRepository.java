package com.bytecode.starcms.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bytecode.starcms.Mapper.UsuarioMetadataMapper;
import com.bytecode.starcms.Models.UsuarioMetadata;

@Repository
public class UsuarioMetadataRepository implements IUsuarioMetadataRep {
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(UsuarioMetadata object) {
		try {
			String sql = String.format("insert into usuario_metadata (IdUsuario, Clave, Valor, Tipo) values ('%d', '%s', '%s', '%s')", 
					                  object.getIdUsuario(), object.getClave(), object.getValor(), object.getTipo());
			jdbctemplate.execute(sql);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean Update(UsuarioMetadata object) {
		if(object.getIdUsuarioMetadata()>0) {
			String sql = String.format("update usuario_metadata set IdUsuario='%d', Clave='%s', Valor='%s', Tipo='%s' where IdUsuarioMetadata='%d'",
					object.getIdUsuario(), object.getClave(), object.getValor(), object.getTipo(), object.getIdUsuarioMetadata());
			jdbctemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<UsuarioMetadata> findAll() {
		return jdbctemplate.query("select * from usuario_metadata", new UsuarioMetadataMapper());
	}

	@Override
	public UsuarioMetadata findById(int id) {
		return jdbctemplate.queryForObject("select * from usuario_metadata where IdUsuarioMetadata = ?", new UsuarioMetadataMapper(), id);
	}
}
