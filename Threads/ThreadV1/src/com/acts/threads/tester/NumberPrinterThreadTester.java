package com.acts.threads.tester;

import com.acts.threads.NumberPrinterThread;

public class NumberPrinterThreadTester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		//Creating Thread objects
		NumberPrinterThread t1 = new NumberPrinterThread("t1");
		NumberPrinterThread t2 = new NumberPrinterThread("t2");
		t1.start(); //Start method put thread in Runnable State from new state
		t2.start(); //Start method put thread in Runnable State from new state
		
		for(int i = 0; i < 10; i++) {
			System.out.println(" Number: " + i + " printed by "+ Thread.currentThread().getName());
			Thread.sleep(20);
		}
		t1.join();
		t2.join();
		System.out.println("Main completed");
	}

}
