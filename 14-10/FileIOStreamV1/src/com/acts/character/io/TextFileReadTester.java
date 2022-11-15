package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileReadTester {

	public static void main(String[] args) {
		String data = "";
		String fileName = "abc.txt";

		// Java Appln <- BufferedReader <- FileReader <- File
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));  // File
				PrintWriter pw = new PrintWriter(System.out)) { // Console
			//Java Appln -> PW : Buffered -> Console(System.out)
			while((data = br.readLine()) != null) {
				pw.println(data);
			}
			System.out.println("*******Data writtern to Console*****");

		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println("*****Graceful execution of main*****");
	}
}