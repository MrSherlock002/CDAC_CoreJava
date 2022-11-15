package com.acts.utils;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import com.acts.library.Book;
import com.acts.library.User;

public interface DataUtils {
	public static Map<Integer, User> getHashMap() throws ParseException {
		Map<Integer,User>userMap=new HashMap<>();
		User u1=new User(0,"Sangeeta");
		userMap.put(u1.getUid(), u1);
		User u2=new User(1,"Archana");
		userMap.put(u2.getUid(), u2);
		User u3=new User(2,"Brijesh");
		userMap.put(u3.getUid(), u3);
		User u4=new User(3,"Sakshi");
		userMap.put(u4.getUid(), u4);
		User u5=new User(4,"Prabhat");
		userMap.put(u5.getUid(), u5);
		return userMap;
	}
	public static Map<String,Book> getHashMap1() throws ParseException {
		Map<String,Book>bookMap=new HashMap<>(); 
		Book b1=new Book("101","Let us C","Yashwant Kanetkar",5);
		bookMap.put(b1.getISBN(), b1);
		Book b2=new Book("102","Python Complete Reference","Martin C. Brown",5);
		bookMap.put(b2.getISBN(), b2);
		Book b3=new Book("103","JAVA Complete Reference","Herbert Schildt",5);
		bookMap.put(b3.getISBN(), b3);
		Book b4=new Book("104","Let us JavaScript","Jon Duckettr",5);
		bookMap.put(b4.getISBN(), b4);
		Book b5=new Book("105","DataStructure","Adam Drozdek",5);
		bookMap.put(b5.getISBN(), b5);
		Book b6=new Book("106","OperatingSystem","Peter Galvin",5);
		bookMap.put(b6.getISBN(), b6);
		return bookMap;
	}
}
