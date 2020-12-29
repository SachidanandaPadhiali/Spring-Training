package com.info;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;  
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public int saveEmployee(Employee e){  
	    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSal()+"')";
	    return jdbcTemplate.update(query);  
	}  

	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getName()+"',sal='"+e.getSal()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  

	
	
	
	
	

}