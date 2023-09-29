package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.BookService;

public class BookUpdate {
	public static void main(String[] args) {

		BookService bookService = new BookService();
		Book book = bookService.updateBookNameById(4, "history");
		
		if(book!=null) {
			System.out.println("updated");
		}
		else {
			System.out.println("not updated");
		}
	}
}
