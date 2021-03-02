package com.zoo.dao;

import java.io.Serializable;

public class Staff implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer staffId;
	private String name;
	private Integer age;
	private Double salary;
	private String gender;

	public Staff() {

	}

	public Staff(String name, Integer age, Double salary, String gender) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public Staff(Integer staffId, String name, Integer age, Double salary, String gender) {

		this.staffId = staffId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender="
				+ gender + "]";
	}

}
