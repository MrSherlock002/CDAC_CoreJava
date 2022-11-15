package com.acts.threads;

public class OddNumberPrinterRunnable implements Runnable {

	private Integer min;
	private Integer max;


	public OddNumberPrinterRunnable(Integer min, Integer max) {
		super();
		this.min = min;
		this.max = max;
	}

	//Override run method for logic
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started");
		//First lock
		synchronized (max) {
			System.out.println("Locked on max: " + threadName);

			//Second lock
			synchronized (min) {
				System.out.println("Locked on min: " + threadName);
				try {
					for (int i = min; i < max; i++) {
						if(0 != i%2) {
							System.out.println(threadName + " Number: " + i);
						}
						Thread.sleep(100);
					}
				} catch (InterruptedException e) {
					System.out.println(threadName +" exception: " + e.getMessage());
				}

			}

		}

		System.out.println(threadName + " Completed ");
	}
}
