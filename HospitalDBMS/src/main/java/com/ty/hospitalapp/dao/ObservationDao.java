package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.dto.Observation;

public interface ObservationDao {
	
	public Observation saveObservation(int eid, Observation observation);
	
	public boolean deleteObservationById(int oid);
	
	public Observation getObservationById(int oid);
	
	public Observation updateObservationById(int oid, Observation observation);
	
	public List<Observation> getAllObservation();
	
	public List<Observation> getObservationByDoctorName(String name);

}
