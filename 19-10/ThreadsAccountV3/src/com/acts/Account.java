package com.acts;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Account {
	//Using only 2 fields
	//Focus is on transaction so taken 2 fields only
	private String name;
	private AtomicReference<BigDecimal> balance;
	
	public Account(String name, BigDecimal balance) {
		super();
		this.name = name;
		this.balance = new AtomicReference<BigDecimal>(balance);
	}

	public synchronized BigDecimal getBalance() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return balance.get();
	}

	public synchronized BigDecimal deposit(BigDecimal amount) {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		balance.compareAndSet(balance.get(), balance.get().add(amount));
		return balance.get();
	}
	
	public synchronized BigDecimal withdraw(BigDecimal amount) {
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		balance.compareAndSet(balance.get(),  balance.get().subtract(amount));
		return balance.get();
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
}
