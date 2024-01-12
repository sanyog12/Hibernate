package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.models.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(14, "sahil", 23411);
		Employee e2 = new Employee(15, "Akash", 53421);
		MyUser u1 = new MyUser(10, "xxxx");
		MyUser u2 = new MyUser(11, "yyyy");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(u1);
		session.save(u2);
		tr.commit();
		session.close();

	}

}
