package com.acts.threads;

import java.util.concurrent.BlockingQueue;

import com.acts.Message;

public class Consumer implements Runnable {
	private BlockingQueue<Message> syncQueue;

	public Consumer(BlockingQueue<Message> syncQueue) {
		this.syncQueue = syncQueue;
	}

	@Override
	public void run() {
		System.out.println("Consumer started " + Thread.currentThread().getName());
		try {
			int i = 1; 
			while ( i < 50) {
				Message message = syncQueue.take();
				System.out.println("Message Read " + message);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception" + Thread.currentThread().getName() + " " + e);
		}
		System.out.println("Consumer Completed " + Thread.currentThread().getName());

	}
}
