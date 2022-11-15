package com.acts.threads;

import java.util.concurrent.BlockingQueue;

import com.acts.Message;

public class Producer implements Runnable {
	private BlockingQueue<Message> syncQueue;
	
	public Producer(BlockingQueue<Message> syncQueue) {
		this.syncQueue = syncQueue;
	}
	@Override
	public void run() {
		System.out.println("Started producer " + Thread.currentThread().getName());
		try {
			int i = 1;
			while (i < 100) {
				Message message = new Message(i, "SRC" + i, "DEST" + i, "MESSAGE" + i);
				System.out.println("Message Written "+ message);
				syncQueue.put(message);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception " + Thread.currentThread().getName()+ " " + e);
		}
		System.out.println("Completed producer " + Thread.currentThread().getName());

	}


}
