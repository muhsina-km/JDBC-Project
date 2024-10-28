package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.EncounterDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;

public class EncounterDaoImp implements EncounterDao {

	@Override
	public Encounter saveEncounter(int pid, Encounter encounter) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, pid);
		if (person != null) {
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteEncounterById(int eid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Encounter> getAllEncounter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encounter getEncounterById(int eid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			return encounter;
		}
		else {
			return null;
		}
	}
 
	@Override
	public Encounter updateEncounterById(int eid, Encounter encounter) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter2=entityManager.find(Encounter.class, eid);
		if (encounter2 != null) {
			encounter2.setReason(encounter.getReason());
			encounter2.setDateOfJoin(encounter.getDateOfJoin());
			encounter2.setDischarge(encounter.getDischarge());
			encounter2.setObservations(encounter.getObservations());
			encounter2.setPerson(encounter.getPerson());
			encounter2.setBranchs(encounter.getBranchs());
			encounter2.setMedOrders(encounter.getMedOrders());
			entityTransaction.begin();
			entityManager.remove(encounter2);
			entityTransaction.commit();
			return encounter2;
		}
		else {
			return encounter;
		}
	}

}
