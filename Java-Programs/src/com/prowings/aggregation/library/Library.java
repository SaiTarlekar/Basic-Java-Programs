package com.prowings.aggregation.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	
	String name;
//	List<Book> books;
	
	Book[] book;
	
	public Library() {}

	
	public Library(String name) {
		super();
		this.name = name;
//		books = new ArrayList<>();
		book = new Book[5];
	}
	
	public void showAllBooks(){
		
//		for(Book book : books) {
//			System.out.println();
//		}
	}
	
	
	public Book[] addNewBook(Book newBook) {
		
		int counter = 0;
		for(int i=0; i<book.length; i++) {
			if(book[i] == null) {
				book[i] = newBook;
				break;
			}
			else
				counter++;
		}
		if(book.length == counter)
			System.out.println("Cannot be added.");
			
		return book;		
	}
}
