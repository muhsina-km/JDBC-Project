package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Person;

public interface PersonDao {
	
	public Person savePerson(int eid, Person person);
	
	public boolean deletePersonById(int pid);
	
	public Person getPersonById(int pid);
	
	public Person updatePersonById(int pid, Person person);
	
	public List<Person> getAllPerson();
	
	public List<Person> getPersonByGender(String name);
	
	public List<Person> getPersonByAge(int age);
	
	public Person getPersonByPhone(long phone);

}
