package application;

import java.util.List;
import java.util.Scanner;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("===Test 3 : Seller findById =====");
		Department department= departmentDao.findById(5);
	    System.out.println(department);
		
	     System.out.println("\n===Test 5 : Department findByAll =====");
			List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}     
     
		System.out.println("===Test 1 : Department insert =====");
        Department newDepartment = new Department(null, "Almofarife");
        departmentDao.insert(newDepartment);
        System.out.println("inserindo novo id " + newDepartment.getId());    
     
        System.out.println("\n===Test 4 : Seller update =====");
			
	    department = departmentDao.findById(1);
	    department.setName("Musica");
	    departmentDao.update(department);
	    System.out.println("Update completo");    
	 
	 
	    System.out.println("===Test 2 : Department delet =====");
        System.out.println("Enter com id para deletar: ");
	    int  id = sc.nextInt();
	    departmentDao.deletById(id);
	    System.out.println("Delete comleto");
	 
		 
		 
	}

}
