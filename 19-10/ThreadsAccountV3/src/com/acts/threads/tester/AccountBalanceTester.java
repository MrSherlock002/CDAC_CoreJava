package com.acts.threads.tester;

import java.math.BigDecimal;

import com.acts.Account;
import com.acts.tasks.BalanceCheckerTask;
import com.acts.tasks.DepositTask;
import com.acts.tasks.WithdrawTask;

public class AccountBalanceTester {

	public static void main(String []args){
		Account account = new Account("Trust Account", BigDecimal.valueOf(10000));
		Thread t1 = new Thread(new BalanceCheckerTask(account));
		Thread t2 = new Thread(new DepositTask(account));
		Thread t3 = new Thread(new BalanceCheckerTask(account));
		Thread t4 = new Thread(new WithdrawTask(account));
		Thread t5 = new Thread(new BalanceCheckerTask(account));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Balance:" + account.getBalance());
		System.out.println("Main completed");

	}
}
