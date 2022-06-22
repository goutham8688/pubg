package com.cg.lunch.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Lunch_Table")
public class Lunch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long dishId;

	private String dishName;

	private String dishDescription;

	private Float dishCost;

	public Lunch() {
		super();
	}

	public Lunch(Long dishId, String dishName, String dishDescription, Float dishCost) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishDescription = dishDescription;
		this.dishCost = dishCost;
	}

	public Long getDishId() {
		return dishId;
	}

	public void setDish_id(Long dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDish_name(String dishName) {
		this.dishName = dishName;
	}

	public String getDishDescription() {
		return dishDescription;
	}

	public void setDish_description(String dishDescription) {
		this.dishDescription = dishDescription;
	}

	public Float getDishCost() {
		return dishCost;
	}

	public void setDish_cost(Float dishCost) {
		this.dishCost = dishCost;
	}

}
