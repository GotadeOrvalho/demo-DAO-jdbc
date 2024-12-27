package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById===");
		Seller sl = sd.findById(3);
		
		System.out.println(sl);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment===");
		Department department = new Department(2, null);
		List<Seller> list = sd.findByDepartment(department);
		for ( Seller ss : list) {
			System.out.println(ss);
		}
		
		System.out.println("\n=== TEST 3: Seller findAll===");
		list = sd.findAll();
		for ( Seller ss : list) {
			System.out.println(ss);
		}
		
		System.out.println("\n=== TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sd.insert(newSeller);
		System.out.println("inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: Seller update ===");
		sl = sd.findById(1);
		sl.setName("Martha Waine");
		sd.update(sl);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: Seller delite ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sd.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
