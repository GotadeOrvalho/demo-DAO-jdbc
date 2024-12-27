package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Department department = new Department();

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		/*System.out.println("\n=== TEST 1: Department insert ===");
		Department newDp = new Department(null, "Food");
		departmentDao.insert(newDp);
		System.out.println("inserted! New id = " + newDp.getId());*/
		
		/*System.out.println("\n=== TEST 2: Department update ===");
		department = departmentDao.findById(1);
		department.setName("Products");
		departmentDao.update(department);
		System.out.println("Update completed");*/
		
		/*System.out.println("\n=== TEST 3: Department delite ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");*/
		
		System.out.println("=== TEST 4: Department findById===");
		department = departmentDao.findById(3);
		
		System.out.println(department);
		
		List<Department> list = new ArrayList<>();
		
		System.out.println("\n=== TEST 5: Department findAll===");
		list = departmentDao.findAll();
		for ( Department dd : list) {
			System.out.println(dd);
		}
		
		sc.close();

	}

}
