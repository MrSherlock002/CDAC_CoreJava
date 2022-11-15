package com.acts.tasks;

import com.acts.Account;

public class WithdrawTask implements Runnable{

	private Account account;

	public WithdrawTask(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println("Withdraw started");
		int updatedBal = account.withdraw(1000);
		System.out.println("Account Balance after Withdraw:" + updatedBal);

	}
}
