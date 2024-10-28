package com.ty.hospitalapp.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.HospitalDao;
import com.ty.hospitalapp.dto.Hospital;

public class HospitalDaoImp implements HospitalDao{

	@Override
	public Hospital saveHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}

	@Override
	public boolean deleteHospitalById(int hid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Hospital getHospitalById(int hid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if (hospital != null) {
			return hospital;
		}
		else {
			return null;
		}
	}

	@Override
	public Hospital updateHospitalById(int hid, Hospital hospital) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital2=entityManager.find(Hospital.class, hid);
		if (hospital2 != null) {
			hospital2.setBranchs(hospital.getBranchs());
			hospital2.setName(hospital.getName());
			hospital2.setWebsite(hospital.getWebsite());
			entityTransaction.begin();
			entityManager.remove(hospital2);
			entityTransaction.commit();
			return hospital2;
		}
		else {
			return hospital;
		}
	}

}
