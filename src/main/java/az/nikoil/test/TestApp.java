package az.nikoil.test;

import az.nikoil.create.session.AbstractSessionFactory;
import az.nikoil.dao.DepartmentDAO;
import az.nikoil.dao.UserDAO;
import az.nikoil.dao.impl.DepatmentDAOImpl;
import az.nikoil.dao.impl.UserDAOImpl;
import az.nikoil.model.Department;
import az.nikoil.model.User;
import az.nikoil.service.DepartmentService;
import az.nikoil.service.UserSevice;
import az.nikoil.service.impl.DepartmentServiceImpl;
import az.nikoil.service.impl.UserServiceImpl;

public class TestApp extends AbstractSessionFactory {

	public static void main(String[] args) {
//		UserSevice us = new UserServiceImpl();
//		DepartmentService ds = new DepartmentServiceImpl();
//		DepartmentDAO dd = new DepatmentDAOImpl();
//		Department department = new Department();
//		department.setId(1);
//		department.setName("Head Office");
//		department.setAdress("Pushkin 30");
//		ds.insert(department);
//		System.out.println(ds.findByDepartmentId(1));
		
		User user = new User();
		Department department = new Department();
		DepartmentDAO dd = new DepatmentDAOImpl();
		department.setId(1);
		department.setName("Head Office");
		department.setAdress("Pushkin 30");
		user.setDepartment(department);
		System.out.println(user.getDepartment());
	}
}
