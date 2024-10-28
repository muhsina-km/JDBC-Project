package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.ItemDaoImp;
import com.ty.hospitalapp.dto.Item;

public class ItemService {
	
	public void saveItem(int mid, Item item) {
		ItemDaoImp daoImp=new ItemDaoImp();
		Item item2=daoImp.saveItem(mid, item);
		if (item2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Item getItemById(int id) {
		ItemDaoImp daoImp=new ItemDaoImp();
		Item item=daoImp.getItemById(id);
		if (item!=null) {
			return item;
		}
		else {
			return null;
		}
	}
	
	public void deleteItemById(int id) {
		ItemDaoImp daoImp=new ItemDaoImp();
		boolean flag=daoImp.deleteItemById(id);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
}
