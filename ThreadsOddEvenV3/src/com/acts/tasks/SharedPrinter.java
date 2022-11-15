package com.acts.tasks;

public class SharedPrinter {
	private boolean isOdd = true;

	public synchronized void printEven(int number) {
		while(isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even:"+number);
		isOdd = true;
		notifyAll();
	}

	public synchronized void printOdd(int number) {
		while(!isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd:"+number);
		isOdd = false;
		notifyAll();
	}
}
