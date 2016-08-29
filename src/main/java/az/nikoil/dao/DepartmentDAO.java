package az.nikoil.dao;

import java.util.List;

import az.nikoil.model.Department;

public interface DepartmentDAO {

	void insert(Department department);

	void update(Department department);

	void delete(int departmentId);

	Department findByDepartmentId(int departmentId);

	Department findByDepartmentName(String departmentName);

	List<Department> getAllDepartments();
}
