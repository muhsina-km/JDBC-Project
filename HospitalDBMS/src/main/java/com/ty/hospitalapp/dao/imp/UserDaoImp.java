package com.ty.hospitalapp.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.UserDao;
import com.ty.hospitalapp.dto.User;

public class UserDaoImp implements UserDao {

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	@Override
	public boolean deleteUserById(int uid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, uid);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public User getUserById(int uid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User user=entityManager.find(User.class, uid);
		if (user != null) {
			return user;
		}
		else {
			return null;
		}
	}

	@Override
	public User updateUserById(int uid, User user) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user2=entityManager.find(User.class, uid);
		if (user2 != null) {
			user2.setName(user.getName());
			user2.setEmail(user.getEmail());
			user2.setPhno(user.getPhno());
			user2.setPassword(user.getPassword());
			user2.setRole(user.getRole());
			entityTransaction.begin();
			entityManager.remove(user2);
			entityTransaction.commit();
			return user2;
		}
		else {
			return user;
		}
	}

}
