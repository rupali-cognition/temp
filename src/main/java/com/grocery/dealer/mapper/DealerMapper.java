package com.grocery.dealer.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.grocery.dealer.model.DealerModel;

public class DealerMapper implements RowMapper<DealerModel> {

	@Override
	public DealerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		DealerModel dealerModel=new DealerModel();
	    dealerModel.setDealerid(rs.getInt("dealerid"));
	    dealerModel.setFname(rs.getString("fname"));
	    dealerModel.setLname(rs.getString("lname"));
	    dealerModel.setMobile(rs.getString("mobile"));
	    dealerModel.setEmail(rs.getString("email"));
	    dealerModel.setAdhaarno(rs.getString("adhaarno"));
	    dealerModel.setPanno(rs.getString("panno"));
	    dealerModel.setUsername(rs.getString("username"));
	    dealerModel.setPassword(rs.getString("password"));
	    dealerModel.setAddress(rs.getString("address"));
	    dealerModel.setAccountno(rs.getString("accountno"));
	    //dealerModel.setRoleid(rs.getInt("roleid"));
	    dealerModel.setRolename(rs.getString("rolename"));
	    
		return dealerModel;
	}

}
