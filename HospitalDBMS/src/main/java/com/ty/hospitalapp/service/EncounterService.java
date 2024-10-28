package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.EncounterDaoImp;
import com.ty.hospitalapp.dto.Encounter;

public class EncounterService {
	
	public void saveEncounter(int pid, Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2=daoImp.saveEncounter(pid, encounter);
		if (encounter2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Encounter getEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter=daoImp.getEncounterById(eid);
		if (encounter!=null) {
			return encounter;
		}
		else {
			return null;
		}
	}
	
	public void deleteEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		boolean flag=daoImp.deleteEncounterById(eid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public Encounter updateEncounterById(int eid, Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2=daoImp.updateEncounterById(eid, encounter);
		if (encounter2!=null) {
			return encounter2;
		}
		else {
			return null;
		}
	}



}
