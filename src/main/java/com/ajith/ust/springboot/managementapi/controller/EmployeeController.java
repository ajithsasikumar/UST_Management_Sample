package com.ajith.ust.springboot.managementapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajith.ust.springboot.managementapi.request.EmployeeRequest;
import com.ajith.ust.springboot.managementapi.response.BaseResponse;
import com.ajith.ust.springboot.managementapi.response.EmployeeResponse;
import com.ajith.ust.springboot.managementapi.service.EmployeeService;


@RestController
@RequestMapping("/managementapi/empmanagement")
public class EmployeeController {
	
	  @Autowired
      EmployeeService employeeService;
	  
	  
	  // Get All the records
	  @GetMapping("/list")
	  @ResponseBody
	  public List<EmployeeResponse> list() {
		  
		  List<EmployeeResponse> list = employeeService.list();
		  return list;
	  }
	  
	  // Save the record
	  @PostMapping("/save")
	  public BaseResponse save(@RequestBody EmployeeRequest employeeRequest) {
		 
		  BaseResponse baseResponse = employeeService.save(employeeRequest);
		  return baseResponse;
		  
	  }
	  
}
