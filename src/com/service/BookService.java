package com.service;

import java.util.List;
import java.util.Scanner;
import com.repository.BookRepo;
import com.to.BookTO;
import com.to.UserTO;

public class BookService {
BookRepo bookRepository = new BookRepo();
Scanner sc=new Scanner(System.in);
public void addBook() {

	System.out.println("Enter your Book Id!!");
	int id = sc.nextInt();
	
    sc.nextLine();
	System.out.println("Enter your Name");
	String name = sc.nextLine();

	System.out.println("Enter price");
	int price = sc.nextInt();
	
	BookTO book = new BookTO(id, name, price);

	bookRepository.addBook(book);
}

	
	public List<BookTO> getAllBooks() {
		
		return bookRepository.findAllBooks();	
	}
}
