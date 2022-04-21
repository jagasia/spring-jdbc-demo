package com.cts.hrms.dao;

import java.util.List;

import com.cts.hrms.entity.Branch;

public interface BranchDao {

	int create(Branch branch);

	List<Branch> read();

	Branch read(String bid);

	int update(Branch branch);

	int delete(String bid);

}