package com.ajith.ust.springboot.managementapi.service;

import java.util.List;
import com.ajith.ust.springboot.managementapi.request.EmployeeRequest;
import com.ajith.ust.springboot.managementapi.response.BaseResponse;
import com.ajith.ust.springboot.managementapi.response.EmployeeResponse;

public interface EmployeeService {
	
    public List<EmployeeResponse> list();
	
	public BaseResponse save(EmployeeRequest employeeRequest);

}
