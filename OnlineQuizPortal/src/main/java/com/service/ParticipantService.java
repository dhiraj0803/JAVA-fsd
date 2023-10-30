package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Participant;
import com.bean.Questions;
import com.bean.Quiz;
import com.bean.Responses;
import com.dao.ParticipantDAO;

@Service
public class ParticipantService {
	@Autowired
	ParticipantDAO participantDao;
	
	public String storeParticipant(Participant participant) {
		if(participantDao.storeParticipant(participant)>0) {
			return "Participant details stored";
		}else {
			return "Participant details didn't store";
		}
	}
	
	public List<Quiz> getQuizDetails() {
		return participantDao.getQuizDetails();
	}
	
	public List<Questions> getQuestions() {
		return participantDao.getQuestions();
	}
	
	public String storeResponse(Responses response) {
		if(participantDao.storeResponse(response)>0) {
			return "Response stored";
		}else {
			return "Response didn't store";
		}
	}
}
