package com.acts.anonymous.innerclass;

//Inner class
public class PrinterThread {

	public static void main(String[] args) {
		//Create anonymous inner class for Runnable
		Thread printerThread = new Thread( new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(" Number=" + i);
				}
			}
		});
		printerThread.start();
	}
}
