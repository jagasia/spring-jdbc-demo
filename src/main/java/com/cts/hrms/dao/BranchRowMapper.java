package com.cts.hrms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.hrms.entity.Branch;

public class BranchRowMapper implements RowMapper<Branch>
{

	@Override
	public Branch mapRow(ResultSet rs, int rowNum) throws SQLException {
		Branch branch=new Branch();
		branch.setBid(rs.getString(1));
		branch.setBname(rs.getString(2));
		branch.setBcity(rs.getString(3));
		return branch;
	}

}
