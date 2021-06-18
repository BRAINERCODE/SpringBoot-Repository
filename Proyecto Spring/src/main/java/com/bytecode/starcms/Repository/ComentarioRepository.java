package com.bytecode.starcms.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.starcms.Mapper.ComentarioMapper;
import com.bytecode.starcms.Models.Comentario;

@Repository
public class ComentarioRepository implements IComentarioRep {
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Comentario object) {
		try {
			String sql = String.format(
					"insert into comentario (Comentario,IdPost,IdUsuario,Respuesta) values ('%s','%d','%d','%d')",

					object.getComentario(), object.getIdPost(), object.getIdUsuario(), object.getRespuesta());

			jdbctemplate.execute(sql);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean Update(Comentario object) {
		
			String sql = String.format("update comentario set Comentario ='%s', IdPost = '%d', IdUsuario='%d',Respuesta='%d'"
					+ "where IdComentario='%d'", object.getComentario(),
					object.getIdPost(), object.getIdUsuario() , object.getRespuesta());
			jdbctemplate.execute(sql);
			return true;
		
	}

	@Override
	public List<Comentario> findAll() {
		
		return jdbctemplate.query("select * from comentario", new ComentarioMapper());
	}

	@Override
	public Comentario findById(int id) {
		
		return jdbctemplate.queryForObject("select * from comentario where IdComentario=?", 
				new ComentarioMapper(),id);
	}
}
