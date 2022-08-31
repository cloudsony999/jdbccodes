package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.project.config.ConnectionProvider;

public class App {

	void talk1() throws SQLException {
		try (Connection con = ConnectionProvider.makeConnection_Oracle()) {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select ename,sal from emp");
			while (rs.next())
				System.out.println("ename " + rs.getString("ename") + " sal " + rs.getInt("sal"));
		}
	}

	void talk2() throws SQLException {
		try (Connection con = ConnectionProvider.makeConnection_Oracle()) {
			PreparedStatement pst = con.prepareStatement("select ename ,sal from emp where deptno=? and job=?");
			pst.setInt(1, 20);
			pst.setString(2, "ANALYST");
			ResultSet rs = pst.executeQuery();
			while (rs.next())
				System.out.println("ename " + rs.getString("ename") + " sal " + rs.getInt("sal"));

			System.out.println("------------pre compiled sql stored in the cache memory------------");
			pst.setInt(1, 10);
			pst.setString(2, "CLERK");
			rs = pst.executeQuery();
			while (rs.next())
				System.out.println("ename " + rs.getString("ename") + " sal " + rs.getInt("sal"));

		}
	}

	void talk3() throws SQLException {
		try (Connection con = ConnectionProvider.makeConnection_Oracle()) {

			Statement st = con.createStatement();
			int noOfRowsAffected = st.executeUpdate("create table mytab2(id number primary key,name varchar2(22))");
			System.out.println(noOfRowsAffected);// it must be 0
		}
	}

	void talk4() throws SQLException {
		try (Connection con = ConnectionProvider.makeConnection_Oracle()) {
			PreparedStatement pst = con.prepareStatement("insert into mytab values(?,?)");
			pst.setInt(1, 20);
			pst.setString(2, "ANALYST");
			int noOfRowsAffected = pst.executeUpdate();// works for DML insert/update/delete sql return int
			System.out.println(noOfRowsAffected);// it must be 1
			System.out.println("------------pre compiled sql stored in the cache memory------------");
			pst.setInt(1, 10);
			pst.setString(2, "CLERK");
			noOfRowsAffected = pst.executeUpdate();
			System.out.println(noOfRowsAffected);// it must be 1

		}
	}

	void talk5(String sql) throws SQLException {
		try (Connection con = ConnectionProvider.makeConnection_Oracle()) {
			Statement st = con.createStatement();
			boolean b = st.execute(sql);
			if (b) {
				System.out.println("select is fired as it returns a ResultSet");
				ResultSet rs = st.getResultSet();
				while (rs.next())
					System.out.println(rs.getString("ename"));
			} else {
				System.out.println("Other than Select .....");

			}
		}

	}

	public static void main(String[] args) {
		App a = new App();
		try {
			a.talk5(JOptionPane.showInputDialog("enter SQL", "type here"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}

//public static void main(String[] args) {
//
//	Connection conO, conM;
//	try {
//		conO = ConnectionProvider.makeConnection_Oracle();
//		conM = ConnectionProvider.makeConnection_Mysql();
//
//		System.out.println(conO.getClass().getName());
//		System.out.println(conM.getClass().getName());
//
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//
//}