package model.dao;

import java.util.List;

import model.entites.Department;
import model.entites.Seller;

public interface SellerDAO {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findaAll();
	List<Seller> findByDepartment(Department department);

}
