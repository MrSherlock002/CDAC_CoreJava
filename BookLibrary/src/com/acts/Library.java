package com.acts;

import java.time.LocalDate;

public class Library {
//
//	1. Use HashSet
//	Book details : title,bookType(enum),price,publishedDate ,authorName,quantity
//	Unique ID : book title
//	Get data from user and store Books in Hashset

	private String ISBN;
	private String bookTitle;
	private String bookPrice;
	private LocalDate publishedDate;
	private String authorName;
	private Integer quantity;
	
	
	public Library() {
		super();
	}

	public Library(String iSBN, String bookTitle, String bookPrice, LocalDate publishedDate, String authorName,
			Integer quantity) {
		super();
		ISBN = iSBN;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Library [ISBN=" + ISBN + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", publishedDate="
				+ publishedDate + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}	
}
