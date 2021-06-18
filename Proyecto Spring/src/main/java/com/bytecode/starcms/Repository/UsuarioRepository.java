package com.bytecode.starcms.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.starcms.Mapper.UsuarioMapper;
import com.bytecode.starcms.Models.Usuario;

@Repository
public class UsuarioRepository implements IUsuarioRep {
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Usuario object) {
		try {
			String sql = String.format("insert into usuario (Nombre, Apellido, Contrasena, Correo, IdGrupo) values ('%s', '%s', '%s', '%s', '%d')", 
					                  object.getNombre(), 
					                  object.getApellido(),
					                  object.getContraseña(),
					                  object.getCorreo(),
					                  object.getIdGrupo());
			jdbctemplate.execute(sql);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean Update(Usuario object) {
		if(object.getIdUsuario()>0) {
			String sql = String.format("update usuario set Nombre='%s', Apellido='%s', Contrasena='%s', Correo='%s', IdGrupo='%d' where IdUsuario='%d'", 
					                  object.getNombre(),
					                  object.getApellido(),
					                  object.getContraseña(),
					                  object.getCorreo(), 
					                  object.getIdGrupo(),
					                  object.getIdUsuario());
			jdbctemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Usuario> findAll() {
		
		return jdbctemplate.query("select * from usuario", new UsuarioMapper());
	}

	@Override
	public Usuario findById(int id) {
		
		return jdbctemplate.queryForObject("select * from usuario", new UsuarioMapper(),id);
	}
}
