package com.sistema.hibernate.tarea02.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sistema.hibernate.tarea02.HibernateSession;
import com.sistema.hibernate.tarea02.dao.AircraftDAO;
import com.sistema.hibernate.tarea02.model.Aircraft;

public class HibernateAircraftDAO implements AircraftDAO {
	
	public Aircraft selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Aircraft aircraft = (Aircraft) session.get(Aircraft.class, id);
		session.close();
		return aircraft;
	}

	public List<Aircraft> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Aircraft> aircrafts = session.createCriteria(Aircraft.class).list();
		session.close();
		return aircrafts;
	}

	public void insert(Aircraft aircraft) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(aircraft);
		aircraft.setId(id);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Aircraft aircraft) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(aircraft);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Aircraft aircraft) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(aircraft);
		session.getTransaction().commit();
		session.close();
	}
}
