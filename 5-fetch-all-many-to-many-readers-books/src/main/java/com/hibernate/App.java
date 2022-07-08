package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Book;
import com.hibernate.entity.Reader;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		List<Reader> readers = session.createQuery("from Reader").list();
		// we can use Iterator or ListIterator here
		readers.forEach(reader-> {
			System.out.println(reader.getId());
			System.out.println(reader.getReader());
			
			List<Book> books = reader.getBooks();
			books.forEach(book-> {
				System.out.println(book.getId());
				System.out.println(book.getBook());
			});	
			System.out.println("--------------------------------------");
		});
		
		

		session.close();
		factory.close();
	}
}
