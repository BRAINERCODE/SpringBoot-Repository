package com.bytecode.starcms.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bytecode.starcms.Mapper.PostMapper;
import com.bytecode.starcms.Models.Post;

@Repository
public class PostRepository implements IPostRep {
	@Autowired 
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(Post object) {
		try {
			String sql = String.format("insert into Post (Titulo, Slug, Extracto, IdUsuario, IdCategoria, ImagenDestacada, Tipo) values ('%s','%s', '%s', '%d', '%d', '%s', '%s')",
					      object.getTitulo(), object.getSlug(), object.getExtracto(), object.getIdUsuario(), object.getIdCategoria(), object.getImagenDestacada(), object.getTipo());
			jdbctemplate.execute(sql);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Update(Post object) {
		if(object.getIdPost()>0) {
			String sql = String.format("update Post set Titulo='%s', Slug='%s', Extracto='%s', IdUsuario='%d', IdCategoria='%d', ImagenDestacada='%s', Tipo='%s' where IdPost=%d",
					object.getTitulo(), object.getSlug(), object.getExtracto(), object.getIdUsuario(), object.getIdCategoria(), object.getImagenDestacada(), object.getTipo(), object.getIdPost());
			
			jdbctemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Post> findAll() {
		return jdbctemplate.query("select * from post", new PostMapper());
	}

	@Override
	public Post findById(int id) {
		return jdbctemplate.queryForObject("select * from post where IdPost = ?", new PostMapper(), id);
	}
}
