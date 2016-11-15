package com.sistema.hibernate.tarea02;

import java.util.List;

import com.sistema.hibernate.tarea02.dao.impl.HibernateAircraftDAO;
import com.sistema.hibernate.tarea02.model.Aircraft;
import com.sistema.hibernate.tarea02.model.Pilot;

/**
 * Hello world!
 *
 */
public class Main {

	public static void main(String[] args) {	
		Aircraft aircraft1 = new Aircraft("Boeing 747", 9800F);
		Aircraft aircraft2 = new Aircraft("Boeing 787", 15190F);
		
		Pilot pilot1 = new Pilot("John Doe", 747);
		Pilot pilot2 = new Pilot("Jane Doe", 787);
		
		aircraft1.setPilot(pilot1);
		aircraft2.setPilot(pilot2);
		
		HibernateAircraftDAO hibernateAircraftDAO = new HibernateAircraftDAO();
		
		hibernateAircraftDAO.insert(aircraft1);
		hibernateAircraftDAO.insert(aircraft2);
		
		List<Aircraft> aircrafts = hibernateAircraftDAO.selectAll();
		System.out.println(aircrafts);
	}
}
