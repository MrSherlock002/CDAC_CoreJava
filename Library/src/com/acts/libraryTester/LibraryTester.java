package com.acts.libraryTester;

import java.util.Collections;
import java.util.Scanner;
import com.acts.library.Book;
import com.acts.library.User;
import com.acts.utils.DataUtils;
import java.util.Iterator;
import java.util.Map;

import static java.lang.System.in;
import static java.lang.System.out;

import java.text.ParseException;
public class LibraryTester {
	//private int id;
	private static int qty;
	private String title;
	private String author;

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(in);
		Map<Integer,User>userMap=DataUtils.getHashMap();
		Map<String,Book>bookMap=DataUtils.getHashMap1();
		Book book=new Book();

		int choice=0;

		do {
			out.println("1.Book Collections."
					+ "\n2.Register new Books."
					//+ "\nSort the list by Book name."
					+ "\n3.Register/Add Student."
					+ "\n4.Issue Books."
					+ "\n5.Return Book."
					+ "\n6.Exit.");
			choice=sc.nextInt();

			switch(choice) {

			case 1:{//Add Book details.
				System.out.println(bookMap);


			} break;

			case 2:{//register new book.
				out.println("Enter Book ISBN:");
				String newISBN=sc.next();
				out.println("Enter Book Title:");
				String newTitle=sc.next();
				out.println("Enter Book Author:");
				String newAuthor=sc.next();
				out.println("Enter Quantity:");
				int newQty=sc.nextInt();
				book=new Book(newISBN,newTitle,newAuthor,newQty);
				bookMap.put(book.getISBN(),book);
				out.println("Book added Successfully");
			}
			break;

			case 3:{//register/add user.
				out.println("Enter UserId:");
				int newUserId=sc.nextInt();
				out.println("Enter User Name:");
				String newUserName=sc.next();
				User user=new User(newUserId,newUserName);
				userMap.put(user.getUid(),user);
				out.println("User added Successfully");
				out.println(userMap);
			}
			break;

			case 4://issue book.
			{
				out.println("Enter Book ISBN you want to issue:");
				String issueTitle=sc.next();
				//for(Map.Entry<String, Book> b:bookMap.entrySet()) {
				if(bookMap.containsKey(issueTitle)) {
					
					System.out.println("Book Found");
					String title=book.getTitle();
					//Integer prevQty=bookMap.get(title);
					Integer prevQty = book.getQty();
					if(prevQty==null||prevQty==0) {
						out.println("Book out of Stock");
					}
					else {
						//bookMap.put(title, prevQty-1);
						book.setQty(book.getQty()-1);
					}
				}	
				else {
					out.println("Book not found");
				}

				//}
			}

			break;

			case 5:{//return book
				out.println("Enter Book Title you want to return:");
				String returnTitle=sc.next();
				if(bookMap.containsKey(returnTitle)) {
					System.out.println("Book Found");
					String title=book.getTitle();
					//Integer prevQty=bookMap.get(title);
					Integer prevQty=book.getQty();
					
//					if(prevQty==null) {
//						prevQty=0;
//					}
					//bookMap.put(title, prevQty+qty);
					book.setQty(prevQty+1);
				}

			}
			break;

			case 6:{
				System.exit(0);
			}			
			break;

			default:
				out.println("Invalid Choice");

			}
		}while(choice!=0);
	}
}


