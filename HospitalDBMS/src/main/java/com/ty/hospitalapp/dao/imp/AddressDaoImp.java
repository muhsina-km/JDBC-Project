package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.AddressDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;

public class AddressDaoImp implements AddressDao {

	@Override
	public Address saveAddress(int bid, Address address) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.persist(address);
			entityTransaction.commit();
			return address;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteAddressById(int aid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address=entityManager.find(Address.class, aid);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressById(int aid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Address address=entityManager.find(Address.class, aid);
		if (address != null) {
			return address;
		}
		else {
			return null;
		}
	}

	@Override
	public Address updateAddressById(int aid, Address address) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address2=entityManager.find(Address.class, aid);
		if (address2 != null) {
			address2.setStreet(address.getStreet());
			address2.setState(address.getState());
			address2.setCountry(address.getCountry());
			address2.setPin(address.getPin());
			address2.setBranchs(address.getBranchs());
			entityTransaction.begin();
			entityManager.remove(address2);
			entityTransaction.commit();
			return address2;
		}
		else {
			return address;
		}
	}

}
