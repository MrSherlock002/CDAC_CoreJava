package com.acts.threads;

import com.acts.shared.queue.DataHolderQueue;

public class Consumer implements Runnable {
	private DataHolderQueue dataHolderQueue;

	public Consumer(DataHolderQueue dataHolderQueue) {
		this.dataHolderQueue = dataHolderQueue;
	}

	@Override
	public void run() {
		System.out.println("Consumer started " + Thread.currentThread().getName());
		try {
			int i = 1; 
			while ( i < 10) {
				dataHolderQueue.readMessage();
				Thread.sleep(400);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception" + Thread.currentThread().getName() + " " + e);
		}
		System.out.println("Consumer Completed " + Thread.currentThread().getName());

	}
}
