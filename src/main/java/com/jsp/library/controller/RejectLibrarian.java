package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class RejectLibrarian {
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean res = adminService.rejectLibrarianById(2, 2);
		
		if(res) {
			System.out.println("librarian rejected");
		}
		else {
			System.out.println("rejection unsucessful");
		}
	}

}
