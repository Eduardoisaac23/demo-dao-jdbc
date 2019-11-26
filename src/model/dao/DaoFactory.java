package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaojDBC;

public class DaoFactory {
	// um construtor Criar em SellerDao
	public static SellerDao createSellerDao() {
		return new SellerDaojDBC(DB.getConnection());
	}
	
	// um construtor Criar em DepartmentDao
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
