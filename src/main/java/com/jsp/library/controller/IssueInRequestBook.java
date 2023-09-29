package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class IssueInRequestBook {
	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueInRequestBooksById(2, 1);
		System.out.println(res);
	}

}
