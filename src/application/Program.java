package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById===");
		Seller sl = sd.findById(3);
		
		System.out.println(sl);
	}

}
