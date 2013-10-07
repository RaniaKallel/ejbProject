package tn.edu.esprit.erpBi.clientProject.delegate;

import tn.edu.esprit.erpBi.clientProject.serviceLocator.ServiceLocator;
import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;

public class EmployeeServicesDelegate {

	private static String jndiName = "ejb:/tn.edu.esprit.erpBi.ejbProject/EmployeesServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote";

	private static EmployeesServicesRemote getProxy() {
		return (EmployeesServicesRemote) ServiceLocator.getInstanceOf().getProxy(jndiName);
	}

	public static void doAddEmployee(Employee employee) {
		getProxy().addEmployee(employee);

	}

}
