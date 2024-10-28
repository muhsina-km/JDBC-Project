package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;

public interface AddressDao {
	
	public Address saveAddress(int bid, Address address);
	
	public boolean deleteAddressById(int aid);
	
	public List<Address> getAllAddress();
	
	public Address getAddressById(int aid);
	
	public Address updateAddressById(int aid, Address address);

}
