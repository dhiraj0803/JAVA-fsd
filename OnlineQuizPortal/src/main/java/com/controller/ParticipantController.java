package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Participant;
import com.bean.Questions;
import com.bean.Quiz;
import com.bean.Responses;
import com.service.ParticipantService;

@RestController
public class ParticipantController {
	
	@Autowired
	ParticipantService participantService;
	
	@RequestMapping(value = "participant/storeParticipant",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeParticipant(@RequestBody Participant participant) {		// scan the value from reqeust body in the form json 
		return participantService.storeParticipant(participant);
	}
	
	@RequestMapping(value = "participant/QuizDetails",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> getQuizDetails() {
			return participantService.getQuizDetails();
	}
	
	@RequestMapping(value = "participant/Questions",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Questions> getQuestions() {
			return participantService.getQuestions();
	}
	
	@RequestMapping(value = "participant/storeResponse",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeResponse(@RequestBody Responses response) {		// scan the value from reqeust body in the form json 
		return participantService.storeResponse(response);
	}
	
	
}
