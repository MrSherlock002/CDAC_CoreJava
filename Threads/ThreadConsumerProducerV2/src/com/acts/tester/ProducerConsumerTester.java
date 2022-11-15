package com.acts.tester;

import com.acts.shared.queue.DataHolderQueue;
import com.acts.threads.Consumer;
import com.acts.threads.Producer;

public class ProducerConsumerTester {
	public static void main(String[] args) throws Exception {
		DataHolderQueue queue = new DataHolderQueue();
		//Producer
		Producer producer = new Producer(queue);
		Thread t1 = new Thread(producer, "PRODUCER");
		t1.start();
		
		//Consumer
		Consumer consumer = new Consumer(queue);
		Thread t2 = new Thread(consumer, "CONSUMER");
		t2.start();
		
		System.out.println("Join Threads");
		t1.join();
		t2.join();
		System.out.println("Main Completed");
	}

}
