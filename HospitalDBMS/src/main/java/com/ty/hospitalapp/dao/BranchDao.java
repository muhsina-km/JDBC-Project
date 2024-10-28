package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;

public interface BranchDao {
	
	public Branch saveBranch(int hid, Branch branch);
	
	public boolean deleteBranchById(int bid);
	
	public List<Branch> getAllBranch();
	
	public Branch getBranchById(int bid);
	
	public Branch updateBranchById(int bid, Branch branch);

}
