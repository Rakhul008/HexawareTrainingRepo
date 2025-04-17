package com.bookapp.client;

import java.util.List;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.model.Book;

public class Client {
	
	public static void main(String args[]) {
		Book book=new Book("Java",1,"kathy","Tech",2000);
		IBookDao bookDao=new BookDaoImpl();
		bookDao.addBook(book);
		
	List<Book> books=bookDao.getAllBooks();
	for(Book nbook:books)
		System.out.println(nbook);
	}

}
