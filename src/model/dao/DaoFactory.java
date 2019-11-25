package model.dao;

import model.dao.impl.SellerDaojDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaojDBC();
	}
}
