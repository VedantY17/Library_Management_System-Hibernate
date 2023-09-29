package com.jsp.library.controller;

import com.jsp.library.service.BookService;

public class BookDelete {
	public static void main(String[] args) {

		BookService bookService = new BookService();

		boolean res = bookService.deleteBookById(6);

		if (res == true) {
			System.out.println("book deleted");
		} else {
			System.out.println("book not deleted");
		}

	}
}
