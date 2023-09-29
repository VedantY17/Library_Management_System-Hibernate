package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class AdminSave {
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		Admin admin = new Admin();

		admin.setName("ved");
		admin.setUsername("a1");
		admin.setPassword("a1pass");
		adminService.saveAdmin(admin);
	}

}
