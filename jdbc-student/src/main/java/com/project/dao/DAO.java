package com.project.dao;

import java.util.List;

import com.project.entity.Student;

public interface DAO {

	boolean addStudent(Student student);

	Student findStudent(int id);

	Student updateStudent(int id, Student student);

	boolean deleteStudent(int id);

	Student searchStudentBasedOnEmail(String email);

	List<Student> searchStudentBasedOnName(String name);

}
