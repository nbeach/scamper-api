package com.nicholasbeach.scamper.persistence;

import java.util.List;

public interface ResourceMapper<T> {

	public T retrieve(Integer id);
	public List<T> retrieveAll();
	public List<T> retrieveUpTo(int limit);
	public T create(T object);
	public boolean update(T object);
	public boolean delete(Integer id);

}