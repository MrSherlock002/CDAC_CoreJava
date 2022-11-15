package com.acts.tester;

import java.io.IOException;

import com.acts.utils.TestMethods;

public class Tester5 {
	
	public static void main(String[] args) throws IOException,InterruptedException{
		Thread t1 = new Thread(() -> {
				TestMethods.method6();
		}, "t1");
		Thread t2 = new Thread(() -> {
			TestMethods.method7();
				
		}, "t2");
		t1.start();
		t2.start();
		
		System.out.println("Join Threads");
		
		t1.join();
		t2.join();
		System.out.println("Main Completed");

	}

}
