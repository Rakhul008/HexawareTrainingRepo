package com.bookapp.model;

public class Book {
	

	private String title;
	public Book(String title, int bookID, String author, String category, int price) {
		super();
		this.title = title;
		this.bookID = bookID;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookID=" + bookID + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int bookID;
	private String author;
	private String category;
	private int price;
	
	}

	