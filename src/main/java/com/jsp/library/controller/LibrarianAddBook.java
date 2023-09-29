package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.LibrarianService;

public class LibrarianAddBook {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setName("geography");
		book.setStatus("unavailable");
		
		LibrarianService librarianService = new LibrarianService();
		Book b1 = librarianService.addBook(book);
		
		if(b1!=null) {
			System.out.println("book added by librarian successfully");
		}
		else {
			System.out.println("book not added");
		}
	}
}
