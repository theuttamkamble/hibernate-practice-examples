package com.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_info")
public class Book {
	@Id
	@Column(name = "book_info", length = 4)
	private int id;
	@Column(name = "book", nullable = false)
	private String book;
	@ManyToMany
	private List<Reader> readers;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String book, List<Reader> readers) {
		super();
		this.id = id;
		this.book = book;
		this.readers = readers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public List<Reader> getReaders() {
		return readers;
	}

	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", book=" + book + ", readers=" + readers + "]";
	}

}
