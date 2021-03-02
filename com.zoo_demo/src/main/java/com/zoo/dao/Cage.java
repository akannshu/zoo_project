package com.zoo.dao;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "cage_record")
@Entity
public class Cage implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cageId;
	private String cage_No;
	private String location;
	@OneToOne
	@JoinColumn(name = "animal_fk_id")
	private Animal animal;

	public Cage() {

	}
	public Cage(String cage_No, String location, Animal animal) {
		this.cage_No = cage_No;
		this.location = location;
		this.animal = animal;
	}

	public Cage(Integer cageId, String cage_No, String location, Animal animal) {
		super();
		this.cageId = cageId;
		this.cage_No = cage_No;
		this.location = location;
		this.animal = animal;
	}

	

	public Integer getCageId() {
		return cageId;
	}

	public void setCageId(Integer cageId) {
		this.cageId = cageId;
	}

	public String getCage_No() {
		return cage_No;
	}

	public void setCage_No(String cage_No) {
		this.cage_No = cage_No;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Cage [cageId=" + cageId + ", cage_No=" + cage_No + ", location=" + location + ", animal=" + animal
				+ "]";
	}

}
