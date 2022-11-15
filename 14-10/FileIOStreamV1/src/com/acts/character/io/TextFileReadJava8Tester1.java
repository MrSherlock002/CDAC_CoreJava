package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadJava8Tester1 {

	public static void main(String[] args) {
		System.out.println("Enter file name along with path to read data");
		try (Scanner sc = new Scanner(System.in)) { // This try to close Scanner automatically
			//Java Appln <- BR <- FR <-Text File
			try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
				br.lines() //Getting Stream of Strings: Stream<String>
				.filter(s -> s.length() > 20)
				.map(String :: toLowerCase)
				.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("*****File read successfuly*****");

		}
	}

}
