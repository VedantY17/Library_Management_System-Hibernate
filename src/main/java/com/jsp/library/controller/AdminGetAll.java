package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class AdminGetAll {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		List<Admin> admins = adminService.getAllAdmins();
		for (Admin a : admins) {
			System.out.println("=========================");
			System.out.print(a.getId() + " " + "| ");
			System.out.print(a.getName() + " " + "| ");
			System.out.print(a.getUsername() + " " + "| ");
			System.out.println(a.getPassword() + " " + "| ");
			System.out.println("=========================");

		}
	}

}
