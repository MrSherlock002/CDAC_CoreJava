package com.acts;

import com.acts.enums.PetEnum;

public class Pet {

	private String petId;
	private String name;
	public static PetEnum category;
	public static double unitPrice;
	private int Stocks;
	
	
	public Pet() {
		super();
		
	
	}

	public Pet(String petId, String name, PetEnum category, double unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		Stocks = stocks;
	}


	public String getPetId() {
		return petId;
	}


	public void setPetId(String petId) {
		this.petId = petId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PetEnum getCategory() {
		return category;
	}


	public void setCategory(PetEnum category) {
		this.category = category;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getStocks() {
		return Stocks;
	}


	public void setStocks(int stocks) {
		Stocks = stocks;
	}


	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", Stocks=" + Stocks + "]";
	}
		
}
