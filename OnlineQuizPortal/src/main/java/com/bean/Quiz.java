package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Quiz {
	@Id
	@GeneratedValue
	private int quiz_id;
	private String quiz_topic;

	public int getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}
	public String getQuiz_topic() {
		return quiz_topic;
	}
	public void setQuiz_topic(String quiz_topic) {
		this.quiz_topic = quiz_topic;
	}
	@Override
	public String toString() {
		return "Quiz [quiz_id=" + quiz_id + ", quiz_topic=" + quiz_topic + "]";
	}

	

	
	
	
}
