package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class AdminGet {

	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		Admin admin = adminService.getAdminById(2);

		System.out.print(admin.getId() + " " + "| ");
		System.out.print(admin.getName() + " " + "| ");
		System.out.print(admin.getUsername() + " " + "| ");
		System.out.println(admin.getPassword() + " " + "| ");
		System.out.println("=========================");
	}
}
