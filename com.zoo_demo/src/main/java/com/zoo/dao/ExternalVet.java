package com.zoo.dao;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="in_house_vet")
@DiscriminatorValue("IN_VET")
public class ExternalVet extends Vet{
	
	private static final long serialVersionUID = 1L;
	
	private Double visitngFees;
	private String country;
	
	public ExternalVet() {}

	public ExternalVet(String name, String qualification, String country, Double visitngFees) {
		super(name, qualification);
		this.visitngFees = visitngFees;
		this.country = country;
	}
	
	public Double getVisitngFees() {
		return visitngFees;
	}
	
	public void setSalary(Double visitngFees) {
		this.visitngFees = visitngFees;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	
	
}