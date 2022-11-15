package com.acts.threads;

public class NumberPrinterRunnable implements Runnable {

	//Override run method for logic
	@Override
	public void run() {
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
	}
}
