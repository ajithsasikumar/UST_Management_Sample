package com.ajith.ust.springboot.managementapi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajith.ust.springboot.managementapi.bo.EmployeeInfo;
import com.ajith.ust.springboot.managementapi.domain.EmployeeDomain;
import com.ajith.ust.springboot.managementapi.model.Employee;
import com.ajith.ust.springboot.managementapi.response.BaseResponse;
import com.ajith.ust.springboot.managementapi.response.EmployeeResponse;
import com.ajith.ust.springboot.managementapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired 
	EmployeeDomain employeeDomain;
	
	@Override
	public List<EmployeeResponse> list() {
		
		List<Employee>  list = employeeDomain.list();
        List<EmployeeResponse> responseList = new ArrayList<EmployeeResponse>() ;
        
        list.forEach( (employee) -> { responseList.add( new EmployeeResponse(employee) ); } );
		
		return responseList;
	}

	@Override
	public BaseResponse save(EmployeeInfo employeeInfo) {
		 
		   System.out.print("<<< Inside EmployeeServiceImpl save() >>> ");
		
		   BaseResponse baseResponse = new BaseResponse();
		   Employee employee  = employeeInfoCovertor(employeeInfo);
		
		   employeeDomain.save(employee);
		
		   return baseResponse;
	}
	
	public Employee employeeInfoCovertor (EmployeeInfo employeeInfo) {
		
		Employee employee  = new Employee();
		
		employee.setEmpName(employeeInfo.getEmpName());
		employee.setAge(employeeInfo.getAge());
		employee.setPhoneno(employeeInfo.getPhoneno());
		employee.setSalary(employeeInfo.getSalary());
		employee.setSalaryType(employeeInfo.getSalaryType());
		employee.setDepartment(employeeInfo.getDepartment());
		employee.setEmptype(employeeInfo.getEmptype());
		employee.setEmpstatus(employeeInfo.getEmpstatus());
		employee.setCountry(employeeInfo.getCountry());
		employee.setState(employeeInfo.getState());
		employee.setDistrict(employeeInfo.getDistrict());
		employee.setCity(employeeInfo.getCity());
		employee.setHouseName(employeeInfo.getHouseName());
		employee.setPincode(employeeInfo.getPincode());
		
		return employee;
	}


}
