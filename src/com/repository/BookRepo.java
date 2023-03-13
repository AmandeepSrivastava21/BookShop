package com.repository;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.CP;
import com.to.BookTO;
import com.to.UserTO;



public class BookRepo {
Connection connection  = CP.createConnection();
public void addBook(BookTO book) {
	   
	
	try {
		
		PreparedStatement statement = connection.prepareStatement("insert into book values(?, ?, ?)");

		statement.setInt(1, book.getId());
		statement.setString(2, book.getName());
		statement.setInt(3, book.getPrice());

		statement.executeUpdate();
	}
	catch (Exception e) {
		System.out.println("inside regsiter of UserRepository");
	}

	
}
	
	public List<BookTO> findAllBooks() {
		
		List<BookTO> books = new ArrayList<BookTO>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from book");
			
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int price = resultSet.getInt(3);
				
				BookTO bookTO = new BookTO(id, name, price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
		
	}
}
