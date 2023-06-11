package com.grocery.dealer.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.grocery.dealer.mapper.DealerMapper;
import com.grocery.dealer.model.DealerModel;

@Repository
public class DealerRepository {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public List<DealerModel>getAllDealer(){
	 
    String sql="SELECT dm.dealerid, dm.fname, dm.lname, dm.mobile, dm.email, dm.adhaarno, dm.panno,"
    		+ "       dm.accountno, dm.address, dm.pincode, dm.username, dm.password, r.rolename "
    		+ "FROM dealer_management dm "
    		+ "JOIN role_details r ON dm.roleid = r.roleid";
	List<DealerModel> dealerModels =jdbcTemplate.query(sql, new DealerMapper());
	return dealerModels;
}
	
}