package az.nikoil.dao;

import java.util.List;

import az.nikoil.model.Department;
import az.nikoil.model.User;

public interface UserDAO {

	void insert(User user);

	void update(User user);

	void delete(String username);

	User findByUserName(String username);

	User findByDepartment(int departmentId);
	
	Department getDepartment (int departmentId);

	User findByName(String name);

	List<User> getAllUsers();
}
