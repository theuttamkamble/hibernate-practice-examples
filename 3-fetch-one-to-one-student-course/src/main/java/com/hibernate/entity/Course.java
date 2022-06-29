package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course_info")
public class Course {
	@Id
	@Column(name = "course_id")
	private int id;
	private String course;
	private double fee;
	@OneToOne(mappedBy = "course")
	private Student student;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String course, double fee, Student student) {
		super();
		this.id = id;
		this.course = course;
		this.fee = fee;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", fee=" + fee + ", student=" + student + "]";
	}

}
