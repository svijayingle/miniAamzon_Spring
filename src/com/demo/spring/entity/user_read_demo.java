package com.demo.spring.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Entity;
public class user_read_demo {

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
					System.out.println("loading the User...");
					List<User> tempUser = session.createQuery("from User ").list();
					System.out.println("size : "+tempUser.size());
					for(User u:tempUser)
					{
						System.out.println(u);
					}
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
	}

}