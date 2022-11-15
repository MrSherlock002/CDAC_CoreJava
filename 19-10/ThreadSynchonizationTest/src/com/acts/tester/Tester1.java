package com.acts.tester;

import java.io.IOException;

import com.acts.utils.TestMethods;

public class Tester1 {

	public static void main(String[] args) throws IOException,InterruptedException{
		TestMethods util = new TestMethods();
		Thread t1 = new Thread(() -> {
			util.method1();
		}, "t1");//t1 : New

		Thread t2 = new Thread(() -> {
			util.method1();
		}, "t2");//t2 : NEW

		t1.start();
		t2.start();
		System.out.println("Joining threads");
		t1.join();
		t2.join();
		System.out.println("Main completed");

	}

}
