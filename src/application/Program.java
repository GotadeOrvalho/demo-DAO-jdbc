package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "books");
		
		
		
		Seller sl = new Seller(21, "bob", "bob@gmail.com",  LocalDate.now(),300.0, dp );
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		System.out.println(sl);
	}

}
