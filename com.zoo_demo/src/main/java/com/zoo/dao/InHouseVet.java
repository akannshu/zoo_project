package com.zoo.dao;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="in_house_vet")
@DiscriminatorValue("IN_VET")
public class InHouseVet extends Vet{
	
	private static final long serialVersionUID = 1L;
	
	private Double salary;
	
	public InHouseVet() {}

	public InHouseVet(String name, String qualification, Double salary) {
		super(name, qualification);
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
