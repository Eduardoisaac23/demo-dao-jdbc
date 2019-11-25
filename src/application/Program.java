package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao =  DaoFactory.createSellerDao(); 
		System.out.println("===Test 1 : Seller findById =====");
		Seller seller = sellerDao.findById(3);
		     System.out.println(seller);
		     
		System.out.println("\n===Test 2 : Seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===Test 3 : Seller findByAll =====");
	
		 list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===Test 4 : Seller insert =====");
		
		 Seller newseller = new Seller(null, "Eduardo", "edug.mendes@gmail.com", 
				 new Date(), 4000.00, department);
		 sellerDao.insert(newseller);
		 System.out.println("Inserted! new id " + newseller.getId());
		 
		 System.out.println("\n===Test 5 : Seller update =====");
			
		 seller = sellerDao.findById(1);
		 seller.setName("Isaac Mendes");
		 sellerDao.update(seller);
		 System.out.println("Update completo");
		 
		 
		 System.out.println("\n===Test 6 : Seller delit =====");
		 System.out.println("Enter com id para deletar: ");
		 int  id = sc.nextInt();
		 sellerDao.deletById(id);
		 System.out.println("Delete comleto");
		 
		 sc.close();
		 
	}

}
