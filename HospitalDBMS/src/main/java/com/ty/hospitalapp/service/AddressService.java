package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.AddressDaoImp;
import com.ty.hospitalapp.dto.Address;

public class AddressService {
	
	public void saveAddress(int bid, Address address) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2=daoImp.saveAddress(bid, address);
		if (address2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Address getAddressById(int aid) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address=daoImp.getAddressById(aid);
		if (address!=null) {
			return address;
		}
		else {
			return null;
		}
	}
	
	public void deleteAddressById(int aid) {
		AddressDaoImp daoImp=new AddressDaoImp();
		boolean flag=daoImp.deleteAddressById(aid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public Address updateAddressById(int aid, Address address) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2=daoImp.updateAddressById(aid, address);
		if (address2!=null) {
			return address2;
		}
		else {
			return null;
		}
	}


}
