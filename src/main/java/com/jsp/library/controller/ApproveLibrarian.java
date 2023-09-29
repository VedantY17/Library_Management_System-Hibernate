package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class ApproveLibrarian {
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean res = adminService.approveLibrarianById(1, 2);
		
		if(res) {
			System.out.println("librarian approved");
		}
		else {
			System.out.println("approval unsucessful");
		}
	}

}
