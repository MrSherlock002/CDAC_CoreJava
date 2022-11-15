package com.acts.threads.tester;

import com.acts.threads.NumberPrinterCallable;

public class NumberPrinterThreadTester {

	public static void main(String[] args) throws Exception{
		System.out.println(Thread.currentThread().getName());
		//Creating Thread objects
		NumberPrinterCallable callable =  new NumberPrinterCallable();
		String  value = callable.call();
		System.out.println(value);
		
		System.out.println("Main completed");
	}

}
