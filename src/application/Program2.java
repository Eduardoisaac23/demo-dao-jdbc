package application;

import java.util.Scanner;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("===Test 1 : Department insert =====");
        Department newDepartment = new Department(null, "Almofarife");
        departmentDao.insert(newDepartment);
        System.out.println("inserindo novo id " + newDepartment.getId());
        */
		
		
        /*System.out.println("===Test 2 : Department delit =====");
        System.out.println("Enter com id para deletar: ");
		int  id = sc.nextInt();
		departmentDao.deletById(id);
		System.out.println("Delete comleto");
		*/
		
		/*System.out.println("===Test 3 : Seller findById =====");
		Department department= departmentDao.findById(5);
		     System.out.println(department);*/
		
		
	}

}
