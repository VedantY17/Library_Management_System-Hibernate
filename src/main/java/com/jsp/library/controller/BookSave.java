package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.BookService;

public class BookSave {
	public static void main(String[] args) {

		Book book = new Book();
		book.setName("c++");
		book.setStatus("issued");
		
		BookService bookService = new BookService();
		bookService.saveBook(book);
		
		
	}
}