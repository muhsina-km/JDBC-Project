package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.BranchDaoImp;
import com.ty.hospitalapp.dto.Branch;

public class BranchService {
	
	public void saveBranch(int hid, Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2=daoImp.saveBranch(hid, branch);
		if (branch2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public Branch getBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch=daoImp.getBranchById(bid);
		if (branch!=null) {
			return branch;
		}
		else {
			return null;
		}
	}
	
	public void deleteBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		boolean flag=daoImp.deleteBranchById(bid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public Branch updateBranchById(int bid, Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2=daoImp.updateBranchById(bid,branch);
		if (branch2!=null) {
			return branch2;
		}
		else {
			return null;
		}
	}


}
