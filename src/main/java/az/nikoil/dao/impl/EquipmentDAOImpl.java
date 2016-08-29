package az.nikoil.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import az.nikoil.create.session.AbstractSessionFactory;
import az.nikoil.dao.EquipmentDAO;
import az.nikoil.model.Equipment;

@Repository
public class EquipmentDAOImpl extends AbstractSessionFactory implements EquipmentDAO {

	@Override
	public void insert(Equipment equipment) {
		getSession().save(equipment);
	}

	@Override
	public void update(Equipment equipment) {
		getSession().update(equipment);
	}

	@Override
	public void delete(int equipmentId) {
		getSession().delete(findByEquipmentId(equipmentId));
	}

	@Override
	public Equipment findByEquipmentId(int equipmentId) {
		return (Equipment) getSession().get(Equipment.class, equipmentId);
	}

	@Override
	public List<Equipment> findByUser(String username) {
		return getSession().getNamedQuery("findByUser").list();
	}

	@Override
	public List<Equipment> getAllEquipments() {
		return getSession().getNamedQuery("allEquip").list();
	}

}
