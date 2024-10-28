package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.BranchDao;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;

public class BranchDaoImp implements BranchDao {

	@Override
	public Branch saveBranch(int hid, Branch branch) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return branch;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteBranchById(int bid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Branch getBranchById(int bid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Branch branch=entityManager.find(Branch.class, bid);
		if (branch != null) {
			return branch;
		}
		else {
			return null;
		}
	}

	@Override
	public Branch updateBranchById(int bid, Branch branch) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch2=entityManager.find(Branch.class, bid);
		if (branch2 != null) {
			branch2.setDname(branch.getDname());
			branch2.setPhno(branch.getPhno());
			branch2.setEmail(branch.getEmail());
			branch2.setHospital(branch.getHospital());
			branch2.setAddress(branch.getAddress());
			branch2.setEncounters(branch.getEncounters());
			entityTransaction.begin();
			entityManager.remove(branch2);
			entityTransaction.commit();
			return branch2;
		}
		else {
			return branch;
		}
	}

}
