package com.acts.threads.tester;

public class TestThread extends Thread {
	@Override
	public void run() {
		super.run();
		for(int index =0;index < 10; index++)
		{
			System.out.println(index);
		}
	}

	public static void main(String[] args) {
		TestThread t1 = new  TestThread();
		t1.start();
		t1.stop();
		t1.start();
	}
}
