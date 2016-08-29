package az.nikoil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import az.nikoil.dao.EquipmentDAO;
import az.nikoil.model.Equipment;

@Service
public class EquipmentService implements EquipmentDAO {

	@Autowired
	private EquipmentDAO equipmentDAO;

	@Transactional
	@Override
	public void insert(Equipment equipment) {
		equipmentDAO.insert(equipment);
	}

	@Transactional
	@Override
	public void update(Equipment equipment) {
		equipmentDAO.update(equipment);
	}

	@Transactional
	@Override
	public void delete(int equipmentId) {
		equipmentDAO.delete(equipmentId);

	}

	@Transactional
	@Override
	public Equipment findByEquipmentId(int equipmentId) {
		return equipmentDAO.findByEquipmentId(equipmentId);
	}

	@Transactional
	@Override
	public List<Equipment> findByUser(String username) {
		return equipmentDAO.findByUser(username);
	}

	@Transactional
	@Override
	public List<Equipment> getAllEquipments() {
		return equipmentDAO.getAllEquipments();
	}

}
