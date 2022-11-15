package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadJava8Tester {

	public static void main(String[] args) {
		System.out.println("Enter full file name:");
		try (Scanner sc = new Scanner(System.in)) {// This try to close Scanner automatically
			///Java Appln <- BR <- FR <- Text file
			try(BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
				//Java 8 Stream: public Stream<String> lines()
				br.lines() //get stream of Strings: Stream<String>
				.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("*****File read successfully*****");
		}
	}
}
