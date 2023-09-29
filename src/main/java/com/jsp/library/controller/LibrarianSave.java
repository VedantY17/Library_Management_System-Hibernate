package com.jsp.library.controller;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.LibrarianService;

public class LibrarianSave {
	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		
		Librarian librarian = new Librarian();
		
		librarian.setName("lib2");
		librarian.setEmail("lib2@mail.com");
		librarian.setStatus("approved");
		librarianService.saveLibrarian(librarian);
	}

}
