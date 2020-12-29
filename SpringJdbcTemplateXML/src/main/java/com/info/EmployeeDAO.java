package com.info;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

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
	
	public List<Employee> getAll()
	{
		 return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>() {  
		
		     public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException 
		     { 
	      
	        List<Employee> list=new ArrayList<Employee>();  
	        while(rs.next()){  
	        Employee e=new Employee();  
	        e.setId(rs.getInt(1));  
	        e.setName(rs.getString(2));  
	        e.setSal(rs.getInt(3));  
	        list.add(e);  
	        }  
	        return list;  
	        }  
	    });  
	  }  

	
	public List<Employee> getAllEmployeesRowMapper(){  
		 return jdbcTemplate.query("select * from employee",new RowMapper<Employee>()
		 {  
		    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSal(rs.getInt(3));  
		        return e;  
		    }  
		    });  
		}  

	
	
	

}
