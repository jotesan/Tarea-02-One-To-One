package com.sistema.hibernate.tarea02.dao;

import java.util.List;

import com.sistema.hibernate.tarea02.model.Pilot;

public interface PilotDAO {

	public Pilot selectById(Long id);

	public List<Pilot> selectAll();

	public void insert(Pilot pilot);

	public void update(Pilot pilot);

	public void delete(Pilot pilot);
}
