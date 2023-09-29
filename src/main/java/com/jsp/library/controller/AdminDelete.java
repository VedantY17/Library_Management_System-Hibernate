package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class AdminDelete {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();

		if (adminService.deleteAdminById(3) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}
}
