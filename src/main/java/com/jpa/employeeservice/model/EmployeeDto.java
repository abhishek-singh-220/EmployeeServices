package com.jpa.employeeservice.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jpa.employeeservice.CustomDateDeserializer;
import com.jpa.employeeservice.CustomDateSerializer;

public class EmployeeDto {
   private String id;
   private String name;     
   private int age;     
   private String gender;
   
   @JsonFormat(pattern = "dd-MM-yyyy")
   @JsonProperty(value="DOB") //chnage the name in json resonse-request
   private Date dateOfBirth;
   
   @JsonDeserialize(using = CustomDateDeserializer.class)
   @JsonSerialize(using = CustomDateSerializer.class)
   private Date lastUpdated;
   
	public EmployeeDto() {
		super();
	}
	public EmployeeDto(String id, String name, int age, String gender, Date dateOfBirth, Date lastUpdated) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.lastUpdated = lastUpdated;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Date getlastUpdated() {
		return lastUpdated;
	}
	public void setlastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	} 

}
