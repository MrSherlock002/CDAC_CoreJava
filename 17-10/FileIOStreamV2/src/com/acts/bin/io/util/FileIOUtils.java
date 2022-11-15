package com.acts.bin.io.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import com.acts.bin.io.Book;

public interface FileIOUtils {
//Static method in I/F
	static void saveBooksData(Set<Book> booksSet, String fileName) throws IOException{
		// PW  to store date in files
		// PW -> TEXT File
		//Try with resource for auto closure
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			booksSet.forEach(pw::println);
		}// Closes PW
	}
}
