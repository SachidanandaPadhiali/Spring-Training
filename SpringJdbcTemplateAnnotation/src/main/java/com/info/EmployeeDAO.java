package com.info;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_PERSON = "select * from employee where id = ?";
	private final String SQL_DELETE_PERSON = "delete from employee where id = ?";
	private final String SQL_UPDATE_PERSON = "update employee set name = ?, sal = ?  where id = ?";
	private final String SQL_GET_ALL = "select * from employee";
	private final String SQL_INSERT_PERSON = "insert into employee(id,name,sal) values(?,?,?)";
	
	
	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	
	public List<Employee> getAllEmployee() {
		return jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
	}
	
	
	public Employee getEmployeeById(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new EmployeeMapper());
	}


	
	public boolean createEmployee(Employee person) {
		return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getName(), person.getSal()) > 0;
	}

	

	
	public boolean deleteEmployee(int id) {
		return jdbcTemplate.update(SQL_DELETE_PERSON,id) > 0;
	}

	public boolean updateEmployee(Employee employee) {
		return jdbcTemplate.update(SQL_UPDATE_PERSON, employee.getName(),employee.getSal(),
				employee.getId()) > 0;
	}



}
