package com.hibernate;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Using get() method (it will returns null)
		//Product product = session.get(Product.class, 10);
		//System.out.println(product);

		// Using load() method (it will throws ObjectNotFoundException)
		try {
			Product product2 = session.load(Product.class, 20);
			System.out.println(product2);
		} catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		session.close();
		factory.close();
	}
}
