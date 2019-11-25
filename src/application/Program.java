package application;

import java.util.Date;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "book");
		
		Seller seller = new Seller(21, "Eduardo", "edug.mendes@yahoo.com.br",
				new Date(), 3000.00, obj);
		
		SellerDao sellerDao = new DaoFactory().createSellerDao(); 
        System.out.println(seller);
	}

}
