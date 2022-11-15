package com.acts;

import java.time.LocalDate;
import java.util.LinkedList;

import com.acts.ValidationUtils;
import com.acts.exceptions.LibraryExceptions;

public class DataUtils {
	public static LinkedList<Library> getLibList(){
		LinkedList<Library> bookList = new LinkedList<Library>();
		
		LocalDate validDate1 = ValidationUtils.validateDate("2000-10-10");
		LocalDate validDate2 = ValidationUtils.validateDate("2000-04-04");
		LocalDate validDate3 = ValidationUtils.validateDate("2000-02-02");
		LocalDate validDate4 = ValidationUtils.validateDate("2000-01-01");
		
		bookList.add(new Library("1","Let us Java","430",validDate1,"Y.Kanetkar",10));	
		bookList.add(new Library("2","Wings of Fire","777",validDate2,"APJ Abdul Kalam",10));
		bookList.add(new Library("3","बटाट्याची चाळ","200",validDate3,"P.L. Deshpande",10));
		bookList.add(new Library("4","श्यामची आई","178",validDate4,"Sane Guruji",10));
		bookList.add(new Library("5","मृत्युंजय","1000",validDate4,"Shivaji Savant",10));
		
				return bookList;
	}	
	
	public static Library findByISBN(LinkedList<Library> list, String tempAccNo) throws LibraryExceptions {
		boolean flag = false;
		for(Library a : list) {
			if(tempAccNo.equals(a.getISBN())) {
				System.out.println("Book Found.");
				flag = true;
				return a;
			}
		}
		if(!flag) {
			throw new LibraryExceptions("Account Not Found..!!");
		}
		return null;
	}

	public static Library deleteByISBN(LinkedList<Library> list, String tempAccNo) throws LibraryExceptions {
		for(Library a : list) {
			if(tempAccNo.equals(a.getISBN())) {
				System.out.println("Account Found.");
				list.remove(a);
				System.out.println("Account deleted");
				return a;
			}else {
				throw new LibraryExceptions("Account Not Found..!!");
			}
		}
		return null;
	}
	
	
}
