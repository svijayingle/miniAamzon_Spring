package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestJdbc {

	public static void main(String[] args) {
		String username = "springproject";
		String password = "springhibernate";
		String jdbcUrl = "jdbc:mysql://localhost:3306/spring_project_database?useSSL=false";
		try {
			System.out.println("Connecting to databse ........");
			
			Connection con = DriverManager.getConnection(jdbcUrl,username,password);
			
			System.out.println("Connected Succesfully !!");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
