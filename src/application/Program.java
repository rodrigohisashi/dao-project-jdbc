package application;

import java.util.Arrays;
import java.util.Date;

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
	}
}
