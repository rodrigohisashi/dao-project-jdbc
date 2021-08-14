package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("TESTES do DepartmentDao");
		System.out.println("==== TESTE 1: FindbyId ==== ");
		DepartmentDao dep = DaoFactory.createDepartmentDao(); 
		
		Department dp = dep.findById(4);
		System.out.println(dp);
	}

}
