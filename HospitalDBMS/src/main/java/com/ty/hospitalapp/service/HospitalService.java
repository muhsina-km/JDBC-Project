package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.HospitalDaoImp;
import com.ty.hospitalapp.dto.Hospital;

public class HospitalService {
	
	public void saveHospital(Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital2=daoImp.saveHospital(hospital);
		if (hospital2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Hospital getHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital=daoImp.getHospitalById(hid);
		if (hospital!=null) {
			return hospital;
		}
		else {
			return null;
		}
	}
	
	public void deleteHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean flag=daoImp.deleteHospitalById(hid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public Hospital updateHospitalById(int hid, Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital2=daoImp.updateHospitalById(hid,hospital);
		if (hospital2!=null) {
			return hospital2;
		}
		else {
			return null;
		}
	}

}
