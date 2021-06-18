package com.bytecode.starcms.Repository;

import java.util.List;

public interface BaseRep<T> {

	public boolean Save(T object);
	public boolean Update(T object);
	public List<T> findAll();
	public T findById(int id);
}
