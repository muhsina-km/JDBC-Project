package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.ObservationDaoImp;
import com.ty.hospitalapp.dto.Observation;

public class ObservationService {
	
	public void saveObservation(int eid, Observation observation) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation2=daoImp.saveObservation(eid, observation);
		if (observation2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Observation getObservationById(int oid) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation=daoImp.getObservationById(oid);
		if (observation!=null) {
			return observation;
		}
		else {
			return null;
		}
	}
	
	public void deleteObservationById(int oid) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		boolean flag=daoImp.deleteObservationById(oid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public Observation updateObservationById(int oid, Observation observation) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation2=daoImp.updateObservationById(oid, observation);
		if (observation2!=null) {
			return observation2;
		}
		else {
			return null;
		}
	}


}
