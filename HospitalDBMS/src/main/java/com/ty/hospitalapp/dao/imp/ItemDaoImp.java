package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.ItemDao;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.dto.MedOrder;

public class ItemDaoImp implements ItemDao {

	@Override
	public Item saveItem(int mid, Item item) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medOrder=entityManager.find(MedOrder.class, mid);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteItemById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class, id);
		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Item getItemById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class, id);
		if (item != null) {
			return item;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Branch> getAllItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
