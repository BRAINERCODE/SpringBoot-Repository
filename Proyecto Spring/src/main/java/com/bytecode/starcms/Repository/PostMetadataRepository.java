package com.bytecode.starcms.Repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bytecode.starcms.Mapper.PostMetadataMapper;
import com.bytecode.starcms.Models.PostMetadata;

@Repository
public class PostMetadataRepository implements IPostMetadataRep
{
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public boolean Save(PostMetadata object) {
		try {
			String sql = String.format(
					"insert into posts_metadata (Clave,IdPost,Tipo,Valor) values ('%s','%d','%s','%s')",
					object.getClave(), object.getIdPost(), object.getTipo(), object.getValor());
			jdbctemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean Update(PostMetadata object) {
	
		try {
			String sql = String.format(
					"update posts_metadata set Clave='%s', IdPost='%d', Tipo='%s', Valor='%s'"
							+ "where IdPostMetadata ='%d'",
					object.getClave(), object.getIdPost(), object.getTipo(), object.getValor());
			jdbctemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<PostMetadata> findAll() {
		
		return jdbctemplate.query("select * from post_metadata", new PostMetadataMapper());
	}

	@Override
	public PostMetadata findById(int id) {
		return jdbctemplate.queryForObject("select * from post_metadata where IdPostMetadata = ?", new PostMetadataMapper(), id);
	}
}
