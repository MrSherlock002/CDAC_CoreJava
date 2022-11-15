package com.acts.library;

public class Book {
	private String ISBN;
	private String title;
	private String author;
	private int qty;

	public Book() {
		super();
	}

	public Book(String ISBN, String title, String author, int qty) {
		super();
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.qty=qty;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", qty=" + qty + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Book[ISBN=" + ISBN +" Title=" + title + " Author=" + author +" Qty= "+qty+"]\n";
//	}

}
