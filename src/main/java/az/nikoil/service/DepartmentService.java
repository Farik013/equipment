package az.nikoil.service;

import java.util.List;

import az.nikoil.model.Department;

public interface DepartmentService {

	void insert(Department department);

	void update(Department department);

	void delete(int departmentId);

	Department findByDepartmentId(int departmentId);

	Department findByDepartmentName(String departmentName);

	List<Department> getAllDepartments();
}
