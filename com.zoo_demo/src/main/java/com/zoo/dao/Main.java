package com.zoo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zoo.factory.HibernateSessionFactory;

public class Main {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.getCurrentSession();
//		session.getTransaction().begin();
//		Category category = new Category();
//		Animal lion = new Animal();
//		Animal zebra = new Animal();
//		session.save(category);
//		session.save(lion);
//		session.save(zebra);
//		session.getTransaction().commit();
	}
}
