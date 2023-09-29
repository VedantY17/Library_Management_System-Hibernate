package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class LibrarianDelete {
	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		if (librarianService.deleteLibrarianById(3) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}

}
