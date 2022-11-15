package com.acts.threads.tester;

import com.acts.threads.NumberPrinterRunnable;
import com.acts.threads.NumberPrinterThread;

public class NumberPrinterThreadTester2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		//Creating Thread objects
		NumberPrinterRunnable task1 = new NumberPrinterRunnable();
		Thread t1 = new Thread(task1);
		
		NumberPrinterRunnable task2 = new NumberPrinterRunnable();
		Thread t2 = new Thread(task2);
		
		t1.start(); //Start method put thread in Runnable State from new state
		t2.start(); //Start method put thread in Runnable State from new state
		
		for(int i = 0; i < 10; i++) {
			System.out.println(" Number:" + i + " printed by "+ Thread.currentThread().getName());
			Thread.sleep(20);
		}
		t1.join();
		t2.join();
		System.out.println("Main completed");
	}

}
