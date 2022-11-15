package com.acts.bin.io.tester;

//Static import of method
import static com.acts.bin.io.util.DataUtils.getBooksSet;

import java.io.IOException;
import java.util.Scanner;

import com.acts.bin.io.util.FileIOUtils;


public class TestFileObjectSaveTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name:");
			String fileName = sc.nextLine();
			FileIOUtils.saveBooksData(getBooksSet(), fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*****File written successfully*****");
	}
}
