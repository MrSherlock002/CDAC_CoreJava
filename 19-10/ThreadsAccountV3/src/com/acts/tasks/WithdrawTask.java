package com.acts.tasks;

import java.math.BigDecimal;

import com.acts.Account;

public class WithdrawTask implements Runnable{

	private Account account;

	public WithdrawTask(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println("Withdraw started");
		BigDecimal updatedBal = account.withdraw(BigDecimal.valueOf(1000));
		System.out.println("Account Balance after Withdraw:" + updatedBal);

	}
}
