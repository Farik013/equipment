package az.nikoil.dao;

import java.util.List;

import az.nikoil.model.Equipment;

public interface EquipmentDAO {

	void insert(Equipment equipment);

	void update(Equipment equipment);

	void delete(int equipmentId);

	Equipment findByEquipmentId(int equipmentId);

	List<Equipment> findByUser(String username);

	List<Equipment> getAllEquipments();
}
