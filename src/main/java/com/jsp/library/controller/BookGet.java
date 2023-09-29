package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.BookService;

public class BookGet {
	public static void main(String[] args) {

		BookService bookService = new BookService();
		Book book = bookService.getBookById(3);
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getStatus());

	}
}
