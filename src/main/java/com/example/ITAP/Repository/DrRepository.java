package com.example.ITAP.Repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ITAP.Entity.DR;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class DrRepository  {
	private final JdbcTemplate jdbctemp;
	@PersistenceContext
	private EntityManager entmanage;
	
	public DrRepository(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	public List<String> getappnames()
	{
		String sql = "select APPNAME from dr_data_fetch";
		List<String> appnamelist = jdbctemp.queryForList(sql,String.class);
		return appnamelist;
	}
	
//	public String getappdeveloper()
//	{
//	 String sql1 = "select APPDEVELOPER from  dr_data_fetch"; 
//	 List
//	}
	public String findByAppName(String appname) {
	    String query = "SELECT APPDEVELOPER FROM dr_data_fetch WHERE APPNAME = ?";
	    String appdev = jdbctemp.queryForObject(query, String.class, appname);
	    return appdev;
	}
}
	
