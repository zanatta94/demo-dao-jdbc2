package main;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("=== TESTE 1 ===");
		
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n\n=== TESTE 2 ===");
		Department d = new Department(2, null);
		List<Seller> l = sellerDAO.findByDepartment(d);
		
		for(Seller obj : l) {
			
			System.out.println(obj);
		}
		
		System.out.println("\n\n=== TESTE 3 ===");
		
		l = sellerDAO.findaAll();
		
		for(Seller obj : l) {
			
			System.out.println(obj);
		}
		
		System.out.println("\n\n=== TESTE 4 ===");
		Seller ns = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, d);
		
		sellerDAO.insert(ns);
		System.out.println("New seller " + ns.getId());
	}

}
