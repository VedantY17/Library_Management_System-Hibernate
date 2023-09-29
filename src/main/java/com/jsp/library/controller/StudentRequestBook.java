package com.jsp.library.controller;

import com.jsp.library.service.BookService;

public class StudentRequestBook {
	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		boolean res = bookService.requestBook(2, 2);	
		
		if(res==false) {
			System.out.println("book is already issued");
		}
	}

}
