package com.cdac.acts;
import java.util.Scanner;

public class AddressTester {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		arr[0] = 10;
		System.out.println("Enter the no of address you want to enter : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count =0;
		Address[] address = new Address[input];
		while(input > 0) {
			System.out.println("Enter address in format [Line1, line2 , line3, pincode]");
			Address add = new Address(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			address[count] = add;
			count++;
			input--;
		}
		
		for(int i = 0;i< count;i++) {
			System.out.println(address[i].toString());
		}
		 
//		Address add1 = new Address("baba chowk", "karve nagar", "Pune", "14523");
//		address[0]  = add; 
//		address[1]  = add1; 
//		address[2]  = add; 
//		address[3]  = add1; 
//		address[4]  = add1; 
//		System.out.println(address[2].getPinCode());
	}

}
