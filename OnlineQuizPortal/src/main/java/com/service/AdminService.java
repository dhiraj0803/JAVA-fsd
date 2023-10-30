package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Answerkey;
import com.bean.Questions;
import com.bean.Quiz;
import com.dao.AdminDAO;


@Service
public class AdminService {
	@Autowired
	AdminDAO AdminDao;
	
	public String storeQuiz(Quiz quiz) {
		if(AdminDao.storeQuiz(quiz)>0) {
			return "Quiz details stored";
		}else {
			return "Quiz details didn't store";
		}
	}
	
	public List<Quiz> getQuizDetails() {
		return AdminDao.getQuizDetails();
	}
	
	public String storeQuestions(Questions questions) {
		if(AdminDao.storeQuestions(questions)>0) {
			return "Questions stored";
		}else {
			return "Questions didn't store";
		}
	}
	
	public String storeAnswerkey(Answerkey ans) {
		if(AdminDao.storeAnswerkey(ans)>0) {
			return "Answer stored";
		}else {
			return "Answer didn't store";
		}
	}
}
