package com.acts.character.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriter {

	public static void main(String[] args) {
		String text = "";
		String fileName = "abc.txt";

		//Java Appln -> PW : -> File
		//Java Appln -> PW : Buffered -> FW : Low level/Node stream -> File
		try(Scanner sc = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(new FileWriter(fileName, true), true)) {
			System.out.println("Pleases enter text:");
			while(!(text = sc.next()).equals("exit")) {

				pw.println(text);
				System.out.println("Pleases enter text:");
			}
			System.out.println("*******Data writtern to file*****");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("*****Graceful execution of main*****");
	}
}