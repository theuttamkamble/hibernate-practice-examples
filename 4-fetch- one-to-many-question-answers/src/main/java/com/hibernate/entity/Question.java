package com.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question_info")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "question_id")
	private int id;
	private String question;
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<Answer> answers;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(String question, List<Answer> answers) {
		super();
		this.question = question;
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + "]";
	}

}
