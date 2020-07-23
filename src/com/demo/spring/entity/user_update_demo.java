package com.demo.spring.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Entity;
public class user_update_demo {

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
					System.out.println("Connected");

					
					// start a transaction
					session.beginTransaction();
					
					// save the student object
					System.out.println("Updating the User...");
					
					//session.createQuery("update User set password='12345' where email='perry@yahoo.com'").executeUpdate();
					
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
	}

}