package com.acts.threads;

import java.io.IOException;
import java.util.List;

import com.acts.Book;
import com.acts.io.util.BinFileIOUtils;

public class BinaryPersisterRunnable implements Runnable {
	private List<Book> bookList;
	private String fileName;
	

	public BinaryPersisterRunnable(List<Book> bookList, String fileName) {
		super();
		this.bookList = bookList;
		this.fileName = fileName;
	}

	@Override
	public void run() { 
		System.out.println("Binary file save Started " + System.currentTimeMillis());
		try {
			BinFileIOUtils.saveBooks(bookList, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Binary file save Completed " + System.currentTimeMillis());
	}

}
