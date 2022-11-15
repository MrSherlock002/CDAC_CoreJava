package com.acts.threads.tester;
import static java.lang.Thread.currentThread;

import com.acts.threads.NumberPrinterThread;

public class NumberPrinterThread1Tester {

	public static void main(String[] args) throws InterruptedException{
		//Main thread
		System.out.println(currentThread());
		NumberPrinterThread t1 = new NumberPrinterThread("t1");
		t1.start();
		NumberPrinterThread t2 = new NumberPrinterThread("t2");
		t2.start();
		NumberPrinterThread t3 = new NumberPrinterThread("t3");
		t3.start();
		NumberPrinterThread t4 = new NumberPrinterThread("t4");
		t4.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " Number " + i);
			Thread.sleep(100);// sleep for millis
		}
		
		System.out.println("Keep main waiting to finish");
		
		System.out.println("T1 Alive " + t1.isAlive());
		System.out.println("T2 Alive " + t2.isAlive());
		System.out.println("T3 Alive " + t3.isAlive());
		System.out.println("T4 Alive " + t4.isAlive());
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("T1 Alive " + t1.isAlive());
		System.out.println("T2 Alive " + t2.isAlive());
		System.out.println("T3 Alive " + t3.isAlive());
		System.out.println("T4 Alive " + t4.isAlive());
		
		System.out.println("Main thread finished");
	}

}
