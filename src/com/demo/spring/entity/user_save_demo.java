package com.demo.spring.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class user_save_demo {

	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(User.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {			
					// create a student object
					System.out.println("Creating new student object...");
					User tempUser = new User("vijay", "ingle", "Nandura","443404","vijay@gmail.com","inglevijay","vijayingle");
					
					// start a transaction
					session.beginTransaction();
					
					// save the student object
					System.out.println("Saving the User...");
					session.save(tempUser);
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
	}

}
