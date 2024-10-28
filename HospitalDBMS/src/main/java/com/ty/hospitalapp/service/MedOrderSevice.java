package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.MedOrderDaoImp;
import com.ty.hospitalapp.dto.MedOrder;

public class MedOrderSevice {
	
	public void saveMedOder(int eid, MedOrder medOrder) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medOrder2=daoImp.saveMedOrder(eid, medOrder);
		if (medOrder2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public MedOrder getMedOrderById(int mid) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medOrder=daoImp.getMedOrderById(mid);
		if (medOrder!=null) {
			return medOrder;
		}
		else {
			return null;
		}
	}
	
	public void deleteMedOrderById(int mid) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		boolean flag=daoImp.deleteMedOrderById(mid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medOrder2=daoImp.updateMedOrderById(mid, medOrder);
		if (medOrder2!=null) {
			return medOrder2;
		}
		else {
			return null;
		}
	}

}
