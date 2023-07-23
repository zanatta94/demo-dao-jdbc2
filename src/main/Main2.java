package main;

import java.util.ArrayList;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entites.Department;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Department d = new Department(8, "TI");
		
		DepartmentDAO dao = DAOFactory.createDepartmentDAO();
		
		
		List<Department> l = new ArrayList<>();
		l = dao.findaAll();
		
		for(Department obj : l) {
			System.out.println(obj);
		}

	}

}
