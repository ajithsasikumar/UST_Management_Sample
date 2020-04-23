package com.ajith.ust.springboot.managementapi.response;

import com.ajith.ust.springboot.managementapi.model.Employee;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class EmployeeResponse extends BaseResponse {

	 private String empName;
	 private int age;
	 private long phoneno;
	 private double salary;
	 private String salaryType;
	 private int department;
	 private String emptype;
	 private String empstatus;
	 private String country;
     private String state;
	 private String district;
	 private String city;
	 private String houseName;
	 private String pincode;
	 
	 public EmployeeResponse( Employee employee ) {

		this.empName = employee.getEmpName();
		this.age = employee.getAge();
		this.phoneno = employee.getPhoneno();
		this.salary = employee.getSalary();
		this.salaryType = employee.getSalaryType();
		this.department = employee.getDepartment();
		this.emptype = employee.getEmptype();
		this.empstatus = employee.getEmpstatus();
		this.country = employee.getCountry();
		this.state = employee.getState();
		this.district = employee.getDistrict();
		this.city = employee.getCity();
		this.houseName = employee.getHouseName();
		this.pincode = employee.getPincode();
		
	 }
	 
}
