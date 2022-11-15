package com.acts;

import java.math.BigDecimal;

public class Account {
	//Using only 2 fields
	//Focus is on transaction so taken 2 fields only
	private String name;
	private BigDecimal balance;
	
	public Account(String name, BigDecimal balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public synchronized BigDecimal getBalance() {
		System.out.println(System.currentTimeMillis());
		return balance;
	}

	public synchronized BigDecimal deposit(BigDecimal amount) {
		System.out.println(System.currentTimeMillis());
		return balance.add(amount);
	}
	
	public synchronized BigDecimal withdraw(BigDecimal amount) {
		System.out.println(System.currentTimeMillis());
		return balance.subtract(amount);
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
}
