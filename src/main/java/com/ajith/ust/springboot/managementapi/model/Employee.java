package com.ajith.ust.springboot.managementapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_employee")
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode

public class Employee {
	
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 @Column(name="id")
	 private long id;
	 
	 @Column(name="empName")
	 private String empName;
	 
	 @Column(name="age")
	 private int age;
	 
	 @Column(name="phoneno")
	 private long phoneno;
	 
	 @Column(name="salary")
	 private double salary;
	 
	 @Column(name="salaryType")
	 private String salaryType;
	 
	 @Column(name="department")
	 private int department;
	 
	 @Column(name="emptype")
	 private String emptype;
	 
	 @Column(name="empstatus")
	 private String empstatus;
	 
	 @Column(name="country")
	 private String country;
		
	 @Column(name="state")
	 private String state;
		
	 @Column(name="district")
	 private String district;
		
	 @Column(name="city")
	 private String city;
		
	 @Column(name="houseName")
	 private String houseName;
		
	 @Column(name="pincode")
	 private String pincode;
	 
}

