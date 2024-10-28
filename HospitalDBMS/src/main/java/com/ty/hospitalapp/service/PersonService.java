package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.PersonDaoImp;
import com.ty.hospitalapp.dto.Person;

public class PersonService {
	
	public void savePerson(int eid, Person person) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person2=daoImp.savePerson(eid, person);
		if (person2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Person getPersonById(int pid) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person=daoImp.getPersonById(pid);
		if (person!=null) {
			return person;
		}
		else {
			return null;
		}
	}
	
	public void deletePersonById(int pid) {
		PersonDaoImp daoImp=new PersonDaoImp();
		boolean flag=daoImp.deletePersonById(pid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public Person updatePersonById(int pid, Person person) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person2=daoImp.updatePersonById(pid, person);
		if (person2!=null) {
			return person2;
		}
		else {
			return null;
		}
	}


}
