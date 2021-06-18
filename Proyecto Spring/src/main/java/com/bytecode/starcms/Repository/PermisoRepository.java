package com.bytecode.starcms.Repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.starcms.Mapper.PermisoMapper;
import com.bytecode.starcms.Models.Permiso;

@Repository
public class PermisoRepository implements IPermisoRep{
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Permiso object) {
		try {
			String sql = String.format("insert into permiso (Nombre) values ('%s')",
					object.getNombre());
			jdbctemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean Update(Permiso object) {
		if (object.getIdPermiso()>0) {
			String sql = String.format("update permiso set Nombre='%s' where IdPermiso='%d'",
					object.getNombre(),object.getIdPermiso());
			jdbctemplate.execute(sql);
			return true;
		}
		
		return false;
		
	}

	@Override
	public List<Permiso> findAll() {
		return jdbctemplate.query("select * from permiso", new PermisoMapper());
	}

	@Override
	public Permiso findById(int id) {
		
		return jdbctemplate.queryForObject("select * from permiso where IdPermiso = ?", new PermisoMapper(), id);
	}
}
