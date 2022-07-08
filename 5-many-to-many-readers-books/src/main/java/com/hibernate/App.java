package com.hibernate;

import java.util.ArrayList;
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

		// creating readers
		// reader 1
		Reader uttam = new Reader();
		uttam.setId(101);
		uttam.setReader("uttam");

		// reader 2
		Reader radha = new Reader();
		radha.setId(102);
		radha.setReader("radha");

		// creating books
		// book 1
		Book book1 = new Book();
		book1.setId(23);
		book1.setBook("Wings of fire");

		// book 2
		Book book2 = new Book();
		book2.setId(24);
		book2.setBook("Something i never told you");

		// book 3
		Book book3 = new Book();
		book3.setId(25);
		book3.setBook("Everything happens for a reason");

		// creating uttam's book list
		List<Book> uttamsBookList = new ArrayList<Book>();
		uttamsBookList.add(book1);
		uttamsBookList.add(book3);

		// creating radha's book list
		List<Book> radhasBookList = new ArrayList<Book>();
		radhasBookList.add(book1);
		radhasBookList.add(book2);
		radhasBookList.add(book3);

		uttam.setBooks(uttamsBookList);

		radha.setBooks(radhasBookList);

		// creating readers list
		List<Reader> readersList = new ArrayList<Reader>();
		readersList.add(uttam);
		readersList.add(radha);
		
		List<Reader> readersList2 = new ArrayList<Reader>();
		readersList2.add(radha);
		
		book1.setReaders(readersList);
		book2.setReaders(readersList2);
		book3.setReaders(readersList);
		
		

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		session.save(uttam);
		session.save(radha);
		session.save(book1);
		session.save(book2);
		session.save(book3);
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
