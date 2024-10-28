package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.ObservationDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Observation;

public class ObservationDaoImp implements ObservationDao {

	@Override
	public Observation saveObservation(int eid, Observation observation) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();
			return observation;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteObservationById(int oid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation=entityManager.find(Observation.class, oid);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Observation getObservationById(int oid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Observation observation=entityManager.find(Observation.class, oid);
		if (observation != null) {
			return observation;
		}
		else {
			return null;
		}
	}

	@Override
	public Observation updateObservationById(int oid, Observation observation) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation2=entityManager.find(Observation.class, oid);
		if (observation2 != null) {
			observation2.setDname(observation.getDname());
			observation2.setRobservation(observation.getRobservation());
			observation2.setEncounters(observation.getEncounters());
			entityTransaction.begin();
			entityManager.remove(observation2);
			entityTransaction.commit();
			return observation2;
		}
		else {
			return observation;
		}
	}

	@Override
	public List<Observation> getAllObservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Observation> getObservationByDoctorName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
