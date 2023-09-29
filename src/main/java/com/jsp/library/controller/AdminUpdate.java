package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class AdminUpdate {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		Admin admin = adminService.updatePasswordByIdPass(2, "a2", "a2pass", "a02pass");

		if (admin != null) {
			System.out.println("your password has been updated");
		} else {
			System.out.println("password updation failed");
		}
	}

}
