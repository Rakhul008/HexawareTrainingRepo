package com.bookapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.bookapp.model.Book;
import com.bookapp.util.DbConnectionUtil;
import com.bookapp.util.DbPropertiesUtil;

public class BookDaoImpl implements IBookDao{
Connection connection;
	@Override
	public void addBook(Book book) {

		connection=DbConnectionUtil.getConnection();
		String sql = "insert into book values(?,?,?,?,?)";
		PreparedStatement statement=null;

			try {
				statement = connection.prepareStatement(sql);
				statement.setString(1,book.getTitle());
				statement.setInt(2,book.getBookID());
				statement.setString(3,book.getAuthor());
				statement.setString(4,book.getCategory());
				statement.setDouble(5,book.getPrice());
				statement.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void updateBook(int bookId, double price) {
		connection=DbConnectionUtil.getConnection();
		String sql = "update student set book_id=? where price=?";
		Connection connection = null;
		PreparedStatement statement=null;
		
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 2);
			statement.setDouble(2,2000);
			int val = statement.executeUpdate();
			System.out.println(val);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		connection=DbConnectionUtil.getConnection();
		String sql = "select*from book";
		PreparedStatement statement=null;
		List<Book> books=new ArrayList<Book>();
		try {
			statement = connection.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String title=rs.getString("title");
				int bookId=rs.getInt("book_id");
				String author=rs.getString("author");
				String category=rs.getString("category");
				int price=rs.getInt("price");
				Book book=new Book(title,bookId,author,category,price);
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
