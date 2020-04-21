package com.ajith.ust.springboot.managementapi.bo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class EmployeeInfo {
	
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

}
