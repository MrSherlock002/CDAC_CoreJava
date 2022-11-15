package com.acts.threads;

import com.acts.Message;
import com.acts.shared.queue.DataHolderQueue;

public class Producer implements Runnable {
	private DataHolderQueue dataHolderQueue;
	public Producer(DataHolderQueue dataHolderQueue) {
		this.dataHolderQueue = dataHolderQueue;
	}
	@Override
	public void run() {
		System.out.println("Started producer " + Thread.currentThread().getName());
		try {
			int i = 1;
			while (i < 10) {
				dataHolderQueue.writeMessage(new Message(i, "SRC" + i, "DEST" + i, "MESSAGE" + i));
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception " + Thread.currentThread().getName()+ " " + e);
		}
		System.out.println("Completed producer " + Thread.currentThread().getName());

	}


}
