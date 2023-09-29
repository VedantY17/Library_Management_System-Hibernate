package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Book;
import com.jsp.library.service.LibrarianService;

public class ViewAllInRequestBooks {
	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		List<Book> books = librarianService.viewAllInRequestBooks();

		for (Book b : books) {
			System.out.println("==============");
			System.out.println(b.getId());
			System.out.println(b.getName());
			System.out.println(b.getStatus());
			System.out.println("===============");
		}
	}

}
