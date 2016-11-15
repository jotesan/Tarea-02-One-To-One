package com.sistema.hibernate.tarea02.dao;

import java.util.List;

import com.sistema.hibernate.tarea02.model.Aircraft;

public interface AircraftDAO {

	public Aircraft selectById(Long id);

	public List<Aircraft> selectAll();

	public void insert(Aircraft aircraft);

	public void update(Aircraft aircraft);

	public void delete(Aircraft aircraft);

}
