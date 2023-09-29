package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class IssueBook {
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueBookById(1,2,1);
		System.out.println(res);

	}

}
