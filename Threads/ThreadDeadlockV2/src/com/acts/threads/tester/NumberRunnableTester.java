package com.acts.threads.tester;
import static java.lang.Thread.currentThread;

import com.acts.threads.EvenNumberPrinterRunnable;
import com.acts.threads.OddNumberPrinterRunnable;

public class NumberRunnableTester {

	public static void main(String[] args) throws InterruptedException {
		// main thread
		System.out.println(currentThread());
		//Create Runnable
		Integer min = 10;
		Integer max = 20;
		EvenNumberPrinterRunnable evenTask = 
				new EvenNumberPrinterRunnable(min, max);
		OddNumberPrinterRunnable oddTask = 
				new OddNumberPrinterRunnable(min, max);
		//Pass the task to Threads. Runnable alone can not run
		Thread evenT1 = new Thread(evenTask, "Even");
		Thread oddT2 = new Thread(oddTask, "Odd");
		
		evenT1.start();
		oddT2.start();
		
		evenT1.join();
		oddT2.join();
		System.out.println("Main completed.");
	}

}
