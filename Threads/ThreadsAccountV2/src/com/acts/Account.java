package com.acts;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
	//Using only 2 fields
	//Focus is on transaction so taken 2 fields only
	private String name;
	private AtomicInteger balance;
	
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = new AtomicInteger(balance);
	}

	public synchronized int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance.get();
	}

	public synchronized int deposit(int amount) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance.compareAndSet(balance.get(), balance.get() + amount);
		return balance.get();
	}
	
	public synchronized int withdraw(int amount) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance.compareAndSet(balance.get(), balance.get() - amount);
		return balance.get();
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
}
