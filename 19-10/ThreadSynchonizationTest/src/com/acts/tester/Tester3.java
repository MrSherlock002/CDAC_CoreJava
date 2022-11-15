package com.acts.tester;

import java.io.IOException;

import com.acts.utils.TestMethods;

public class Tester3 {
	
	public static void main(String[] args) throws IOException,InterruptedException{
		TestMethods util = new TestMethods();
		Thread t1 = new Thread(() -> {
				util.method3();
		}, "t1");//t1 : New
		Thread t2 = new Thread(() -> {
				util.method4();
		}, "t2");//t2 : New
		t1.start();
		t2.start();
		System.out.println("Join threads");
		t1.join();
		t2.join();
		System.out.println("Main completed");

	}

}
