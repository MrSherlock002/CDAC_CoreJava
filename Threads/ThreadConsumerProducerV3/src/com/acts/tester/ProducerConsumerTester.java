package com.acts.tester;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.acts.Message;
import com.acts.threads.Consumer;
import com.acts.threads.Producer;

public class ProducerConsumerTester {
	public static void main(String[] args) throws Exception {
		//Create Blocking queue
		BlockingQueue<Message> syncQueue = new ArrayBlockingQueue<>(100);
		//Producer
		Producer producer = new Producer(syncQueue);
		Thread t1 = new Thread(producer, "PRODUCER");
		t1.start();
		
		//Consumer
		Consumer consumer = new Consumer(syncQueue);
		Thread t2 = new Thread(consumer, "CONSUMER");
		t2.start();
		
		Consumer consumer1 = new Consumer(syncQueue);
		Thread t3 = new Thread(consumer1, "CONSUMER");
		t3.start();
		
		System.out.println("Join Threads");
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main Completed");
	}

}
