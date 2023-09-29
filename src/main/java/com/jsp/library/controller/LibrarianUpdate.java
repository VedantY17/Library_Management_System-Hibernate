package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class LibrarianUpdate {
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		if (librarianService.updateLibrarianMailById(7, "pandu@mail.com") != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	}

}
