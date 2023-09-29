package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class AdminLogin {
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean res = adminService.validateAdmin(1, "a4", "a1pass");
		
		if(res) {
			System.out.println("login successfull");
		} else {
			System.out.println("invalid crediantials!! Try Again!");
		}
	}

}
