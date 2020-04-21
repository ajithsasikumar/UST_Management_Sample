package com.ajith.ust.springboot.managementapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.ust.springboot.managementapi.model.Employee;

public interface ManagementRepository extends JpaRepository<Employee, Integer>{
 
}
