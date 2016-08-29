package az.nikoil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import az.nikoil.dao.DepartmentDAO;
import az.nikoil.model.Department;
import az.nikoil.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	@Transactional
	public void insert(Department department) {
		departmentDAO.insert(department);

	}

	@Override
	@Transactional
	public void update(Department department) {
		departmentDAO.update(department);

	}

	@Override
	@Transactional
	public void delete(int departmentId) {
		departmentDAO.delete(departmentId);

	}

	@Override
	@Transactional
	public Department findByDepartmentId(int departmentId) {
		return departmentDAO.findByDepartmentId(departmentId);
	}

	@Override
	@Transactional
	public Department findByDepartmentName(String departmentName) {
		return departmentDAO.findByDepartmentName(departmentName);
	}

	@Override
	@Transactional
	public List<Department> getAllDepartments() {
		return departmentDAO.getAllDepartments();
	}
}
