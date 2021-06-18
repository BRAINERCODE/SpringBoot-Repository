package com.bytecode.starcms.Repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bytecode.starcms.Mapper.GrupoPermisoMapper;
import com.bytecode.starcms.Models.GrupoPermiso;

@Repository
public class GrupoPermisoRepository implements IGrupoPermisoRep{
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(GrupoPermiso object) {
		try {
			String sql  = String.format("insert into grupo_permiso (IdGrupo,IdPermiso) values ('%d','%d')", 
					object.getIdGrupo(),object.getIdPermiso());
			jdbctemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean Update(GrupoPermiso object) {
		if(object.getIdGrupo()>0) {
			String sql = String.format("update  grupo_permiso set IdGrupo='%d', IdPermiso='%d'",
					object.getIdGrupo(),object.getIdPermiso());
			jdbctemplate.execute(sql);
			
		}
		return false;
	}

	@Override
	public List<GrupoPermiso> findAll() {
		
		return jdbctemplate.query("select * from grupo_permiso", new GrupoPermisoMapper());
	}

	@Override
	public GrupoPermiso findById(int id) {
		return jdbctemplate.queryForObject("select * from grupo_permiso where IdGrupoPermiso = ?", new GrupoPermisoMapper(),id);
	}
}
