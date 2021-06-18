package com.bytecode.starcms.Repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.starcms.Mapper.ContenidoMapper;
import com.bytecode.starcms.Models.Contenido;

@Repository
public class ContenidoRepository implements IContenidoRep{
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Contenido object) {
		try {
			String sql = String.format("insert into contenido (Contenido,IdPost,Tipo) values ('%s','%d','%s')",
					object.getContenido(),object.getIdPost(),object.getTipo());
			jdbctemplate.execute(sql);
			
			return true;
			
		} catch (Exception e) {
			return false;

		}
	}

	@Override
	public boolean Update(Contenido object) {

		String sql = String.format("update contenido set  Contenido='%s',IdPost='%d',Tipo='%s'" + "where IdContenido='%d'", 
				object.getContenido(),object.getIdPost(),object.getTipo(), object.getIdContenido());
		jdbctemplate.execute(sql);
		return true;
		
	}

	@Override
	public List<Contenido> findAll() {
		
		return jdbctemplate.query("select * from contenido", new ContenidoMapper());
	}

	@Override
	public Contenido findById(int id) {
		
		return jdbctemplate.queryForObject("select * from contenido where IdContenido=?", new ContenidoMapper(),id);
	}
}
