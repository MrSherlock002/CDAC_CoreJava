package com.acts;

import com.acts.enums.OrderEnums;
import com.acts.enums.PetEnum;

public class Order extends Pet{
	private int orderId=100;
	private int quantity;
	private String status;
	
	public Order() {
		super();
	}


	public Order(String petId, String name, OrderEnums category, double unitPrice, int stocks) {
		super();
	}


	@Override
	public String toString() {
		//return super.toString() + "Order [orderId=" + orderId + ", quantity=" + quantity + ", status=" + status + "]";
		return "Order[ PetId : "+super.getPetId() + "orderId=" + orderId + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
		
}
