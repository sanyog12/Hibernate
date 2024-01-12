package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.models.*;

public class TestEmpProj {
	public static void main(String args[]) {
	
		Address addr = new Address(1,"happy","York");
		Address addr1 = new Address(1,"dappy","happy");
		MyUser u1 = new MyUser(1,"bhupu",addr);
		MyUser u2 = new MyUser(2,"bhupu",addr1);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		/*
		 * sess.save(addr1); sess.save(addr);
		 */
		sess.save(u1);
		sess.save(u2);
		tr.commit();
		sess.close();
	}
}
