package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answerkey {
	@Id
	@GeneratedValue
	private int SNo;
	private String answer;
	private int ques_id;
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getQues_id() {
		return ques_id;
	}
	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}
	
	@Override
	public String toString() {
		return "Answerkey [SNo=" + SNo + ", answer=" + answer + "]";
	}
	
	
}
