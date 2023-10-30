package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Participant;
import com.bean.Questions;
import com.bean.Quiz;
import com.bean.Responses;

@Repository
public class ParticipantDAO {
	
	@Autowired
	EntityManagerFactory emf;
	
	public int storeParticipant(Participant participant) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(participant);							// session.save(emp)
			tran.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public List<Quiz> getQuizDetails() {
		EntityManager manger = emf.createEntityManager();
		Query qry = manger.createQuery("select q from Quiz q");  			// JPQL 
		List<Quiz> listOfQuiz = qry.getResultList();
		return listOfQuiz;
	}
	
	public List<Questions> getQuestions() {
		EntityManager manger = emf.createEntityManager();
		Query qry = manger.createQuery("select q from Questions q");  			// JPQL 
		List<Questions> listOfQuestions = qry.getResultList();
		return listOfQuestions;
	}
	
	public int storeResponse(Responses response) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(response);							// session.save(emp)
			tran.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
}
