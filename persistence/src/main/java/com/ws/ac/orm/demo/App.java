package com.ws.ac.orm.demo;

import java.util.Random;

import org.hibernate.Session;

import com.ws.ac.orm.dao.util.HibernateUtil;
import com.ws.ac.orm.domain.Company;
import com.ws.ac.orm.domain.Employee;
import com.ws.ac.orm.domain.Office;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Company company = new Company();
		company.setCompId(new Random().nextInt());
		company.setCompName("Cisco");
		company.setCompDescription("All abt networking");

		Office office = new Office();
		office.setId(new Random().nextInt());
		office.setName("Megaplex");
		office.setCompany(company);
		session.save(office);

		Employee employee = new Employee();
		employee.setId(new Random().nextInt());
		employee.setDesignation("Architect");
		employee.setName("Ranjan");

		// to create foreign key relationship
		employee.setCompany(company);

		session.save(employee);

		// Commented these 3 lines as it does not add any value.
		// ArrayList<Employee> employees = new ArrayList<Employee>();
		// employees.add(employee);
		// company.setEmployees(employees);

		session.save(company);

		// session.delete(stock);

		session.getTransaction().commit();

	}
}
