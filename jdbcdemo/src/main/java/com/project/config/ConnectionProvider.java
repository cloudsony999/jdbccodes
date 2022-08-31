package com.project.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	// deprecated from java 6
//	static {
//		try {
//			Class c = Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("driver loaded " + c.getName());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("driver not loaded...." + e);
//		}
//	}

	public static Connection makeConnection_Oracle() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##scott", "tiger");

	}

	public static Connection makeConnection_Mysql() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");

	}

}
