package com.ty.hospitalapp.dao;

import com.ty.hospitalapp.dto.Hospital;

public interface HospitalDao {
	
	public Hospital saveHospital(Hospital hospital);
	
	public boolean deleteHospitalById(int hid);
	
	public Hospital getHospitalById(int hid);
	
	public Hospital updateHospitalById(int hid, Hospital hospital);

}
