package com.ajith.ust.springboot.managementapi.domain;

import java.util.List;

import com.ajith.ust.springboot.managementapi.model.Employee;

public interface EmployeeDomain {
	
     public List<Employee> list();
	 
	 public Boolean save(Employee employee);

}
