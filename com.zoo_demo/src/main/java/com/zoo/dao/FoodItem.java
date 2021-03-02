package com.zoo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "food_item")
public class FoodItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer food_item_id;
	private String name;
	private Integer quantity;
	@ManyToOne
	@JoinColumn(name = "supplier_fk_id", nullable = false)
	private Supplier supplier;
	
	@ManyToMany(mappedBy = "foodItem")
	private List<Animal> animal = new ArrayList<>();

	public FoodItem() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}
	
	
	
}
