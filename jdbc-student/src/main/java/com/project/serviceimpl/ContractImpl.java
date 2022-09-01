package com.project.serviceimpl;

import com.project.dao.DAO;
import com.project.daoimpl.DAOImpl;
import com.project.entity.Student;
import com.project.service.Contract;

public class ContractImpl implements Contract {

	private final DAO dao = new DAOImpl();// polymorphic variable
	// private DAOImpl dao2 = new DAOImpl();

	@Override
	public boolean addStudentService(Student student) {
		if (dao.addStudent(student))

			return true;
		else
			return false;
	}

	public void rubbish() {
		System.out.println("----not required-----------");
	}

}
