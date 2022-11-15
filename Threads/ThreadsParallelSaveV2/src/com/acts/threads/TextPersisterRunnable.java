package com.acts.threads;

import java.io.IOException;
import java.util.List;

import com.acts.Book;
import com.acts.io.util.TextFileIOUtils;

public class TextPersisterRunnable implements Runnable {
	private List<Book> bookList;
	private String fileName;
	
	public TextPersisterRunnable(List<Book> bookList, String fileName) {
		super();
		this.bookList = bookList;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println("Text file save Started " + System.currentTimeMillis());
		try {
			TextFileIOUtils.saveBooksData(bookList, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Text file save Completed " + System.currentTimeMillis());
	}

}
