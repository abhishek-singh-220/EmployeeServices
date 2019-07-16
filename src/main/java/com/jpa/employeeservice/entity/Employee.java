package com.jpa.employeeservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	@Id
    @GenericGenerator(
            name = "assigned-sequence",
            strategy = "com.jpa.employeeservice.entity.EmpIdGenerator"
        )
	@GeneratedValue(generator="assigned-sequence")
	private String id;
	private String name;     
	private int age;     
	private String gender;
    private Date dateOfBirth;
    private Date lastUpdated;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, int age, String gender, Date dateOfBirth, Date lastUpdated) {
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
