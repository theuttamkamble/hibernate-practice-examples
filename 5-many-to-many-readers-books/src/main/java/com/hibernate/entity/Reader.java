package com.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reader_info")
public class Reader {
	@Id
	@Column(name = "reader_id", length = 4)
	private int id;
	@Column(name = "reader", length = 255, nullable = false)
	private String reader;
	@ManyToMany(mappedBy = "readers")
	private List<Book> books;

	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reader(String reader, List<Book> books) {
		super();
		this.reader = reader;
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReader() {
		return reader;
	}

	public void setReader(String reader) {
		this.reader = reader;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Reader [id=" + id + ", reader=" + reader + "]";
	}

}
