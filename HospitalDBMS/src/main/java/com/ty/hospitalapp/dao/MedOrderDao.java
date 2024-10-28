package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.MedOrder;

public interface MedOrderDao {
	
	public MedOrder saveMedOrder(int eid, MedOrder medOrder);
	
	public boolean deleteMedOrderById(int mid);
	
	public MedOrder getMedOrderById(int mid);
	
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder);
	
	public List<MedOrder> getAllMedOrder();

	public List<MedOrder> getMedOrderByDoctorName(String name);
	
	public List<MedOrder> getMedOrderByDate(String date);

}
