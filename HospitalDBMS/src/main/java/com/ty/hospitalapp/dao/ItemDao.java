package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Item;

public interface ItemDao {
	
	public Item saveItem(int mid, Item item);
	
	public boolean deleteItemById(int id);
	
	public Item getItemById(int id);
	
	public List<Branch> getAllItem();

}
