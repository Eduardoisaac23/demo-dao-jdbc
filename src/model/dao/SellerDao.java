package model.dao;

import java.util.List;

import mode.entities.Department;
import mode.entities.Seller;

public interface SellerDao {

	//implementação do dao de Seller
	void insert(Seller obj);
	void update(Seller obj);
	void deletById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();//assinatura do meu metodo
	List<Seller> findByDepartment(Department department);//assinatura do meu metodo
}
