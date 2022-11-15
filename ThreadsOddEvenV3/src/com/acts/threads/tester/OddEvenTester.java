package com.acts.threads.tester;

import com.acts.tasks.OddEvenTask;
import com.acts.tasks.SharedPrinter;

public class OddEvenTester {

	public static void main(String []args){
		SharedPrinter printer = new SharedPrinter();
		Thread t1 = new Thread(new OddEvenTask(printer, 100,  false));
		Thread t2 = new Thread(new OddEvenTask(printer, 100, true));
		t1.start();
		t2.start();
	}
}
