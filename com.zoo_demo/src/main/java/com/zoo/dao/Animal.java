package com.zoo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "animal_record")
@Entity

public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animalId;
	private String type;
	private Integer totalNumber;
	@OneToOne(mappedBy = "animal") // Reverse Owner
	private Cage cage;
	@ManyToOne
	@JoinColumn(name = "category_fk_id", nullable = false)
	private Category category;
	@ManyToMany
	@JoinTable(name = "animal_with_foodItem", 
	joinColumns = @JoinColumn(name="animal_fk_id"), 
	inverseJoinColumns = @JoinColumn(name="foodItem_fk_id"))
	private List<FoodItem> foodItem = new ArrayList<>();
	
	public Animal() {}

	public Animal(String type, Integer totalNumber) {
		super();
		this.type = type;
		this.totalNumber = totalNumber;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<FoodItem> getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(List<FoodItem> foodItem) {
		this.foodItem = foodItem;
	}
	
	
	

}
