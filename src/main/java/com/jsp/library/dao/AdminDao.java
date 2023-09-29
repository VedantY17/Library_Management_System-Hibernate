package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Admin;

public class AdminDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}

	public Admin deleteAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		entityTransaction.begin();
		entityManager.remove(admin);
		entityTransaction.commit();
		return admin;
	}

	public Admin updatePasswordByIdPass(int id, String newpassword) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setPassword(newpassword);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return admin;
	}

	public Admin getAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	public List<Admin> getAllAdmins() {
		String sql = "SELECT a FROM Admin a";
		Query query = entityManager.createQuery(sql);
		List<Admin> admins = query.getResultList();
		return admins;
	}

}
