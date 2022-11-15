package com.acts.io.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.acts.Book;

public interface TextFileIOUtils {
//Static method in I/F
	static void saveBooksData(List<Book> booksList, String fileName) throws IOException{
		// PW  to store date in files
		// PW -> TEXT File
		//Try with resource for auto closure
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			booksList.forEach(pw::println);
		}// Closes PW
	}
}
