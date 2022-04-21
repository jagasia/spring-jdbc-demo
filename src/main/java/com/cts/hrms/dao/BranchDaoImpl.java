package com.cts.hrms.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.hrms.entity.Branch;

public class BranchDaoImpl implements BranchDao {
	
	private JdbcTemplate jt;		
	
	public BranchDaoImpl() {}
	
	public JdbcTemplate getJt() {
			return jt;
		}
		public void setJt(JdbcTemplate jt) {
			this.jt = jt;
		}
	@Override
	public int create(Branch branch) {
		String sql="INSERT INTO BRANCH VALUES(?,?,?)";
		return jt.update(sql, branch.getBid(), branch.getBname(), branch.getBcity());
	}
	@Override
	public List<Branch> read() {
		String sql="SELECT * FROM BRANCH";
		return jt.query(sql, new BranchRowMapper());
	}
	@Override
	public Branch read(String bid) {
		String sql="SELECT * FROM BRANCH WHERE BID=?";
		return jt.queryForObject(sql, new BranchRowMapper(), bid);
	}
	@Override
	public int update(Branch branch) {
		String sql="UPDATE BRANCH SET BNAME=?, BCITY=? WHERE BID=?";
		return jt.update(sql, branch.getBname(), branch.getBcity(), branch.getBid());
	}
	@Override
	public int delete(String bid) {
		String sql="DELETE FROM BRANCH WHERE BID=?";
		return jt.update(sql, bid);
	}
	
}
