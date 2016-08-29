package az.nikoil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import az.nikoil.dao.UserDAO;
import az.nikoil.model.Department;
import az.nikoil.model.User;
import az.nikoil.service.UserSevice;

@Service
public class UserServiceImpl implements UserSevice {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public void insert(User user) {
		userDAO.insert(user);
	}

	@Override
	@Transactional
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	@Transactional
	public void delete(String username) {
		userDAO.delete(username);
	}

	@Override
	@Transactional
	public User findByUserName(String username) {
		return userDAO.findByUserName(username);
	}

	@Override
	@Transactional
	public User findByDepartment(int departmentId) {
		return userDAO.findByDepartment(departmentId);
	}

	@Override
	@Transactional
	public Department getDepartment(int departmentId) {
		return userDAO.getDepartment(departmentId);
	}

	@Override
	@Transactional
	public User findByName(String name) {
		return userDAO.findByName(name);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}
}
