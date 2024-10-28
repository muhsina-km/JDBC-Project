package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;

public interface EncounterDao {
	
	public Encounter saveEncounter(int pid, Encounter encounter);
	
	public boolean deleteEncounterById(int eid);
	
	public List<Encounter> getAllEncounter();
	
	public Encounter getEncounterById(int eid);
	
	public Encounter updateEncounterById(int eid, Encounter encounter);

}
