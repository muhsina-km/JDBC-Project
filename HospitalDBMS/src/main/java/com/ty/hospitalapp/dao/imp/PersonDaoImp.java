package com.ty.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.PersonDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;

public class PersonDaoImp implements PersonDao {

	@Override
	public Person savePerson(int eid, Person person) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deletePersonById(int pid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, pid);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Person getPersonById(int pid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, pid);
		if (person != null) {
			return person;
		}
		else {
			return null;
		}
	}

	@Override
	public Person updatePersonById(int pid, Person person) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person2=entityManager.find(Person.class, pid);
		if (person2 != null) {
			person2.setName(person.getName());
			person2.setAge(person.getAge());
			person2.setGender(person.getGender());
			person2.setPhno(person.getPhno());
			person2.setDob(person.getDob());
			person2.setEmail(person.getEmail());
			person2.setAddress(person.getAddress());
			person2.setEncounters(person.getEncounters());
			entityTransaction.begin();
			entityManager.remove(person2);
			entityTransaction.commit();
			return person2;
		}
		else {
			return person;
		}
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByGender(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPersonByPhone(long phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
