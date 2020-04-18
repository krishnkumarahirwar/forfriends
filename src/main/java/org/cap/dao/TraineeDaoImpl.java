package org.cap.dao;

import org.cap.entities.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Repository
public class TraineeDaoImpl implements ITraineeDao{
	 EntityManagerFactory emf= Persistence.createEntityManagerFactory("trainee-mgt");

	@Override
	public Trainee AddTrainee(Trainee trainee) {
		 EntityManager em = emf.createEntityManager();
	        EntityTransaction transaction = em.getTransaction();
	        transaction.begin();
	        em.persist(trainee);
	        transaction.commit();

	        System.out.println("Added one employee, withd id=" + trainee.getTraineeId());
	        em.close();
		return trainee;
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {
		EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Trainee trainee=em.find(Trainee.class,traineeId);
        em.remove(trainee);
        transaction.commit();
        em.close();
        System.out.println("employee removed with id="+traineeId);
		return trainee ;
	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		  EntityManager em = emf.createEntityManager();
	        EntityTransaction transaction = em.getTransaction();
	        transaction.begin();
	       Trainee traine=em.merge(trainee);
	        transaction.commit();
	        em.close();
	        return traine;
	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Trainee trainee=em.find(Trainee.class, traineeId);
		em.close();
		return trainee;
	}

	@Override
	public List<Trainee> retrieveAllTrainee() {
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		 Query query =em.createQuery("from Trainee");
		List<Trainee> trainee=query.getResultList();
	
		return trainee;
	}

   
}
