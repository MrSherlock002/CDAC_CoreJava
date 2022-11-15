package com.acts.threads.tester;

import java.util.List;
import java.util.Scanner;

import com.acts.Book;
import com.acts.io.util.DataUtils;
import com.acts.threads.BinaryPersisterRunnable;
import com.acts.threads.TextPersisterRunnable;


public class PersisterThreadTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter text file text name:");
			String txtFileName = sc.nextLine();

			System.out.println("Enter binary file name:");
			String binFileName = sc.nextLine();
			
			List<Book> bookList = DataUtils.getBooksList();

			TextPersisterRunnable textPersisterRunnable = 
					new TextPersisterRunnable(bookList, txtFileName);
			
			BinaryPersisterRunnable binaryPersisterRunnable = 
					new BinaryPersisterRunnable(bookList, binFileName);

			Thread textThread = new Thread(textPersisterRunnable);
			//Start Thread
			textThread.start(); 

			Thread binThread = new Thread(binaryPersisterRunnable);
			//Start Thread
			binThread.start();
			
			System.out.println("Main Completed " + System.currentTimeMillis());
		}
	}
}
