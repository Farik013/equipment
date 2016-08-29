package az.nikoil.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import az.nikoil.create.session.AbstractSessionFactory;
import az.nikoil.dao.UserDAO;
import az.nikoil.model.Department;
import az.nikoil.model.User;

@Repository
public class UserDAOImpl extends AbstractSessionFactory implements UserDAO {

	@Override
	public User findByUserName(String username) {
		return (User) getSession().get(User.class, username);
	}

	@Override
	public void insert(User user) {
		getSession().save(user);
	}

	@Override
	public void update(User user) {
		getSession().update(user);
	}

	@Override
	public void delete(String username) {
		getSession().delete(findByUserName(username));
	}

	@Override
	public User findByDepartment(int departmentId) {
		return (User) getSession().get(User.class, departmentId);
	}

	@Override
	public Department getDepartment (int departmentId) {
		return (Department) getSession().get(Department.class, departmentId);
	}

	@Override
	public User findByName(String name) {
		return (User) getSession().get(User.class, name);
	}

	@Override
	public List<User> getAllUsers() {
		return getSession().getNamedQuery("allUsers").list();
	}
}
