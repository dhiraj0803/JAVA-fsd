package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Answerkey;
import com.bean.Questions;
import com.bean.Quiz;

@Repository
public class AdminDAO {
	@Autowired
	EntityManagerFactory emf;
	
	public int storeQuiz(Quiz quiz) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(quiz);							// session.save(emp)
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
	
	public int storeQuestions(Questions questions) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(questions);							// session.save(emp)
			tran.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public int storeAnswerkey(Answerkey ans) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(ans);							// session.save(emp)
			tran.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
}
