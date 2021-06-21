package com.bytecode.starcms.Repository;



import com.bytecode.starcms.Models.Categoria;

public interface ICategoriaRep extends BaseRep<Categoria>{

	public boolean DeleteById(int id) ;
}
