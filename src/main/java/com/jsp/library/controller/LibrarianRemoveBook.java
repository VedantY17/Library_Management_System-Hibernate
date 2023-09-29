package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class LibrarianRemoveBook {
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.removeBookById(9);
		System.out.println(res);
	}

}
