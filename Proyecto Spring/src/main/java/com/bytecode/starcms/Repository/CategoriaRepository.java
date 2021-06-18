package com.bytecode.starcms.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.starcms.Mapper.CategoriaMapper;
import com.bytecode.starcms.Models.Categoria;

@Repository
public class CategoriaRepository implements ICategoriaRep {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Categoria object) {
		try {
			String sql = String.format(
					"insert into categoria (Nombre,Descripcion,CategoriaSuperior) values ('%s','%s','%d')",

					object.getNombre(), object.getDescripcion(), object.getCategoriaSuperior());

			jdbctemplate.execute(sql);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean Update(Categoria object) {
		if (object.getIdCategoria() != 0) {
			String sql = String.format("update categoria set Nombre ='%s', Descripcion = '%s', CategoriaSuperior='%d'"
					+ "where IdCategoria='%d'", object.getNombre(),
					object.getDescripcion(), object.getCategoriaSuperior() , object.getIdCategoria());
			jdbctemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Categoria> findAll() {
		return jdbctemplate.query("select * from categoria",new CategoriaMapper());
	}

	@Override
	public Categoria findById(int id) {
		 return jdbctemplate.queryForObject("SELECT * FROM categoria WHERE id = ?",
		            new CategoriaMapper(), id);
		  
	}

	

}
