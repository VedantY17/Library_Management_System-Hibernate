package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Book;
import com.jsp.library.service.BookService;

public class BookGetAll {
	public static void main(String[] args) {

		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
		
		for(Book b : books) {
			System.out.println(b.getId());
			System.out.println(b.getName());
			System.out.println(b.getStatus());
			System.out.println("==============");
		}
	}

}
