package tn.edu.esprit.erpBi.clientProject.tests;

import tn.edu.esprit.erpBi.clientProject.delegate.EmployeeServicesDelegate;
import tn.edu.esprit.erpBi.ejbProject.domain.Employee;

public class TestAddEmployeeWithDp {
	
	public static void main(String [] args){
		
		Employee employee=new Employee();
		employee.setIdEmployee(2);
		employee.setNameEmployee("emp1");
		EmployeeServicesDelegate.doAddEmployee(employee);
		
		
		
		
	}

}
