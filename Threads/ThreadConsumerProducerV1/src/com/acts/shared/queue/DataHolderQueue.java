package com.acts.shared.queue;

import java.util.LinkedList;

import com.acts.Message;

public class DataHolderQueue {
	private LinkedList<Message> messageList;

	public DataHolderQueue() {
		super();
		this.messageList = new LinkedList<Message>();
	}

	public synchronized void writeMessage(Message message) throws Exception {
		System.out.println("writeMessage " + Thread.currentThread().getName());
		//produce message
		messageList.addLast(message);
		System.out.println("Written Message " + message);
		System.out.println("writeMessage Completed "+Thread.currentThread().getName());
		Thread.sleep(50);
	}

	public synchronized Message readMessage() throws Exception {
		System.out.println("readMessage "+Thread.currentThread().getName());
		//consume message
		Message message  = messageList.removeFirst();
		System.out.println("Read Message " + message);
		System.out.println("Read Message Completed "+Thread.currentThread().getName());
		Thread.sleep(70);
		return message;
	}

}
