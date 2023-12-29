package com.intizor.net.springbootRestfulAPIhibernatepostgresql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employees")
public class EmployeeEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeID;
	
	@Column(name = "name", nullable = false)
	private String name;
	

	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "email_address", nullable = false)
	private String emailID;
	
	
	public EmployeeEntity() {	
	}
	
	public EmployeeEntity(String name, String location, String emailId){	
		this.name = name;
		this.location = location;
		this.emailID = emailId;
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeID + ", name=" + name + ", emailId=" + emailID
			       + "]";
	}

}
