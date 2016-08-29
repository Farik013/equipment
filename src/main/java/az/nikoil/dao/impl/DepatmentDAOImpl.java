package az.nikoil.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import az.nikoil.create.session.AbstractSessionFactory;
import az.nikoil.dao.DepartmentDAO;
import az.nikoil.model.Department;

@Repository
public class DepatmentDAOImpl extends AbstractSessionFactory implements DepartmentDAO {

	@Override
	public void insert(Department department) {
		getSession().save(department);
	}

	@Override
	public void update(Department department) {
		getSession().update(department);
	}

	@Override
	public void delete(int departmentId) {
		getSession().delete(departmentId);
	}

	@Override
	public Department findByDepartmentId(int departmentId) {
		return (Department) getSession().get(Department.class, departmentId);
	}

	@Override
	public Department findByDepartmentName(String departmentName){
		return (Department) getSession().get(Department.class, departmentName);
	}

	@Override
	public List<Department> getAllDepartments() {
		return getSession().getNamedQuery("allDepartments").list();
	}

}
