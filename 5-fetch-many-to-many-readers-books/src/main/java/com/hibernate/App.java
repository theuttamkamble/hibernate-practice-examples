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
		
		
		Reader reader = session.get(Reader.class, 102);
		System.out.println(reader.getId());
		System.out.println(reader.getReader());
		List<Book> books = reader.getBooks();
		books.forEach(book-> {
			System.out.println(book.getId());
			System.out.println(book.getBook());
		});
		
		
		session.close();
		factory.close();
	}
}
