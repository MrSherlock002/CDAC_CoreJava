package com.acts.threads;

public class NumberPrinterThread extends Thread {
	
	//Constructor for Thread:  Default state New
	public NumberPrinterThread(String name) {
		super(name);
	}

	//Override run()method to execute logic
	//Enter to run method and state is running
	//Runnable state to running when run is executed
	@Override
	public void run(){
		System.out.println(this.getName() + " started");
		try {
			//Printing numbers 1 to 10
			for (int i = 0; i < 10; i++) {
				System.out.println(" Number:" + i + " printed by " + this.getName());
				// sleep for millis
				Thread.sleep(20);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " completed");
	}
}
