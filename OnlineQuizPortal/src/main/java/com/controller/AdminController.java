package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Answerkey;
import com.bean.Questions;
import com.bean.Quiz;
import com.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "admin/storeQuiz",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeParticipant(@RequestBody Quiz quiz) {		// scan the value from reqeust body in the form json 
		return adminService.storeQuiz(quiz);
	}
	
	
	
	@RequestMapping(value = "admin/storeQuestions",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeQuestions(@RequestBody Questions questions) {		// scan the value from reqeust body in the form json 
		return adminService.storeQuestions(questions);
	}
	
	@RequestMapping(value = "admin/QuizDetails",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> getQuizDetails() {
			return adminService.getQuizDetails();
	}
	
	@RequestMapping(value = "admin/storeAnswer",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeParticipant(@RequestBody Answerkey ans) {		// scan the value from reqeust body in the form json 
		return adminService.storeAnswerkey(ans);
	}
	
	
}
