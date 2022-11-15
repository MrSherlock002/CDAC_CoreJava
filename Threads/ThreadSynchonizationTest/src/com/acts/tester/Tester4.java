package com.acts.tester;

import java.io.IOException;

import com.acts.utils.TestMethods;

public class Tester4 {

	public static void main(String[] args) throws IOException,InterruptedException{
		Thread t1 = new Thread(() -> {
			TestMethods.method7();
		}, "t1");
		
		Thread t2 = new Thread(() -> {
			TestMethods.method8();
		}, "t2");
		
		t1.start();
		t2.start();
		
		System.out.println("Joining threads");
		t1.join();
		t2.join();
		System.out.println("Main Completed");
	}

}
