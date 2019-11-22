package model.dao;

import java.util.List;

import mode.entities.Department;

public interface DepartmentDao {

	//implementação do dao de Department
	void insert(Department obj);
	void update(Department obj);
	void deletById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
	
}
