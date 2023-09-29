package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class ReturnBook {
	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.returnBookById(1);
		System.out.println(res);
	}

}
