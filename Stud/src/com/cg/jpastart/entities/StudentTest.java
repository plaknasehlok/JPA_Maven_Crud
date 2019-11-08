package com.cg.jpastart.entities;

import javax.persistence.*;

import com.cg.jpastart.pojo.Student;

public class StudentTest {
   
	public static void main(String args[]){
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Stud");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Student student=new Student();
		student.setName("John");
		
		em.persist(student);
		em.getTransaction().commit();
		
		
		factory.close();
		em.close();

		System.out.println("added one student..");

	}
}
