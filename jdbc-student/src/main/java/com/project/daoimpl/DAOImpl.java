package com.project.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.config.ConnectionProvider;
import com.project.dao.DAO;
import com.project.entity.Student;

public class DAOImpl implements DAO {

	@Override
	public boolean addStudent(Student student) {
		boolean status = false;
		try (Connection con = ConnectionProvider.makeConnection_Oracle()) {
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setString(4, student.getEmail());

			int noRowsAffected = ps.executeUpdate();
			if (noRowsAffected > 0) {
				status = true;
				con.commit();
			} else {
				con.rollback();
				status = false;
			}

		} catch (SQLException e) {
			// TODO: handle exception

			System.out.println("SQL error " + e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("general error " + e);
		}
		return status;
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student searchStudentBasedOnEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> searchStudentBasedOnName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void bullshit() {
		System.out.println("------------------------rubbish-----------------------------");
	}
}
