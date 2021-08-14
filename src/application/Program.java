package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {


		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sellerDao.findById(2));

		Department department = new Department(2, null);
		System.out.println(Arrays.toString(sellerDao.findByDepartment(department).toArray()));
		
		List<Seller> list = new ArrayList<>();
		
		list = sellerDao.findAll();
		System.out.println("========= TESTE 3 ========");
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}
}
