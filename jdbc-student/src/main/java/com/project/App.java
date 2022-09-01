package com.project;

import com.project.entity.Student;
import com.project.service.Contract;
import com.project.serviceimpl.ContractImpl;

public class App {
	public static void main(String[] args) {
		Contract c = new ContractImpl();
		Student s = new Student();
		s.setId(10);
		s.setName("amitava");
		s.setEmail("a@gmail.com");
		s.setAddress("kolkata");
		if (c.addStudentService(s))
			System.out.println("Student is saved check DB!!!!");
		else
			System.out.println("-----------sorry-----------");
	}
}
