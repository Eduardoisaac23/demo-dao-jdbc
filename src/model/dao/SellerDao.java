package model.dao;

import java.util.List;

import mode.entities.Seller;

public interface SellerDao {

	//implementação do dao de Seller
	void insert(Seller obj);
	void update(Seller obj);
	void deletById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
