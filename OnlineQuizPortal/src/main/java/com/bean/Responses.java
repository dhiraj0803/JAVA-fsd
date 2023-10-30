package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responses {
	@Id
	private int ques_id;
	private String response;
	
	public int getQues_id() {
		return ques_id;
	}
	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Responses [ques_id=" + ques_id + ", response=" + response + "]";
	}
	
	
}
