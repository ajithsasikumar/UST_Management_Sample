package com.ajith.ust.springboot.managementapi.service;

import java.util.List;

import com.ajith.ust.springboot.managementapi.bo.EmployeeInfo;
import com.ajith.ust.springboot.managementapi.response.BaseResponse;
import com.ajith.ust.springboot.managementapi.response.EmployeeResponse;

public interface EmployeeService {
	
    public List<EmployeeResponse> list();
	
	public BaseResponse save(EmployeeInfo employeeInfo);

}
