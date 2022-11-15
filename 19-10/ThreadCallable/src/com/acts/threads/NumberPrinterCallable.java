package com.acts.threads;

import java.util.concurrent.Callable;

public class NumberPrinterCallable implements Callable<String> {

	//Override call method for logic
	@Override
	public String call() throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(threadName + " Number: " + i);
				Thread.sleep(20);
			}
		} catch (InterruptedException e) {
			System.out.println(threadName +" exception: " + e.getMessage());
		}
		System.out.println(threadName + " Completed ");
		return "Success";
	}
}
