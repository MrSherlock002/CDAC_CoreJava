package com.acts.tasks;

import java.math.BigDecimal;

import com.acts.Account;

public class DepositTask implements Runnable{

	private Account account;

	public DepositTask(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println("Deposit Started");
		BigDecimal updatedBal = account.deposit(BigDecimal.valueOf(10000));
		System.out.println("Account Balance after deposit:" + updatedBal);

	}
}
