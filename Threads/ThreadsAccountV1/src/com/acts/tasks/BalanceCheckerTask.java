package com.acts.tasks;

import com.acts.Account;

public class BalanceCheckerTask implements Runnable{

	private Account account;

	public BalanceCheckerTask(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println("Balance Checker Started");
		System.out.println("Account Balance:" + account.getBalance());
	}
}
