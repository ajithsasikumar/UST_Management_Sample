package com.ajith.ust.springboot.managementapi.domainImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ajith.ust.springboot.managementapi.domain.EmployeeDomain;
import com.ajith.ust.springboot.managementapi.model.Employee;
import com.ajith.ust.springboot.managementapi.repositories.ManagementRepository;

@Repository
public class EmployeeDomainImpl implements EmployeeDomain {

	@Autowired
	ManagementRepository repository;
	
	@Override
	public List<Employee> list() {
		
		System.out.print("<<< Inside EmployeeDomainImpl list() >>> ");
		
		List<Employee> list  = new ArrayList<Employee>();
		
		try {
			list = repository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();;
		}
		
		return list;
	}

	@Override
	public Boolean save(Employee employee) {

		System.out.print("<<< Inside EmployeeDomainImpl save() >>> ");
		
		try {
			repository.save(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
