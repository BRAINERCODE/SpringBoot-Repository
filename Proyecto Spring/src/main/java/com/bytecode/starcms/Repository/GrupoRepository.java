package com.bytecode.starcms.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.starcms.Mapper.GrupoMapper;
import com.bytecode.starcms.Models.Grupo;

@Repository
public class GrupoRepository implements IGrupoRep {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Grupo object) {

		try {
         String sql = String.format("insert into grupo (Nombre) values ('%s')",
        		 object.getNombre());
         jdbctemplate.execute(sql);
         return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean Update(Grupo object) {
		String sql = String.format("update grupo set Nombre='%s' where IdGrupo='%d'" , object.getNombre(),object.getIdGrupo());
		jdbctemplate.execute(sql);
		return true;
		
	}

	@Override
	public List<Grupo> findAll() {
		
		return jdbctemplate.query("select * from grupo ", new GrupoMapper());
	}

	@Override
	public Grupo findById(int id) {
		
		return jdbctemplate.queryForObject("select * from grupo where IdGrupo = ?", new GrupoMapper(),id);
	}
}
