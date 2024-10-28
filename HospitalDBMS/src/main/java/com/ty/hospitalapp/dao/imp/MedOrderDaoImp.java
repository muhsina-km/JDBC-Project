package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.MedOrderDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderDao {

	@Override
	public MedOrder saveMedOrder(int eid, MedOrder medOrder) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return medOrder;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteMedOrderById(int mid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medOrder=entityManager.find(MedOrder.class, mid);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public MedOrder getMedOrderById(int mid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		MedOrder medOrder=entityManager.find(MedOrder.class, mid);
		if (medOrder != null) {
			return medOrder;
		}
		else {
			return null;
		}
	}

	@Override
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medOrder2=entityManager.find(MedOrder.class, mid);
		if (medOrder2 != null) {
			medOrder2.setDname(medOrder.getDname());
			medOrder2.setDate(medOrder.getDate());
			medOrder2.setTotal(medOrder.getTotal());
			medOrder2.setItems(medOrder.getItems());
			medOrder2.setEncounters(medOrder.getEncounters());
			entityTransaction.begin();
			entityManager.remove(medOrder2);
			entityTransaction.commit();
			return medOrder2;
		}
		else {
			return medOrder;
		}
	}

	@Override
	public List<MedOrder> getAllMedOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedOrder> getMedOrderByDoctorName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedOrder> getMedOrderByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

}
