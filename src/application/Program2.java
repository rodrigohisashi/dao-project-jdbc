package application;

import java.util.ArrayList;
import java.util.List;

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
		

		System.out.println("==== TESTE 2: FindAll ==== ");
		List<Department> list = new ArrayList<>();
		list = dep.findAll();
		
		for (Department deps : list) {
			System.out.println(deps);
		}
		
		System.out.println("==== TESTE 3: Insert ==== ");
		
		Department dp2 = new Department(null, "Fish");
		
		dep.insert(dp2);
		
		System.out.println("==== TESTE 4: Update ==== ");
		
		dp2 = dep.findById(2);
		
		dp2.setName("Técnico");
		dep.update(dp2);
		

		System.out.println("==== TESTE 5: Delete ==== ");
		
		dep.deleteById(6);
	}

}
