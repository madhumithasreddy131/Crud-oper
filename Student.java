package com.example.week8a;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int regNo;
	String Name;
	String address;
			
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student(int regNo, String name,String address) {
		this.regNo = regNo;
		Name = name;
		this.address = address;
	}
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", Name=" + Name + ", address=" + address + "]";
	}
	
	

}
