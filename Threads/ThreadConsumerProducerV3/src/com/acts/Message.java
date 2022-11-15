package com.acts;

public class Message {
	private int messageId;
	private String source;
	private String destination;
	private String message;
	
	public Message() {
		super();
	}

	public Message(int messageId, String source, String destination, String message) {
		super();
		this.messageId = messageId;
		this.source = source;
		this.destination = destination;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", source=" + source + ", destination=" + destination + ", message="
				+ message + "]";
	}
}
