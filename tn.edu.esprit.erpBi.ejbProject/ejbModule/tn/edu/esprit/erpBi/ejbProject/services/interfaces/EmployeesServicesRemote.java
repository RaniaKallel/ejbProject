package tn.edu.esprit.erpBi.ejbProject.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.manyToManyWithData.Cours;
import tn.edu.esprit.erpBi.ejbProject.manyToManyWithData.Mark;
import tn.edu.esprit.erpBi.ejbProject.manyToManyWithData.User;

@Remote
public interface EmployeesServicesRemote {
	public void addEmployee(Employee employee);

	public Employee findEmployeeById(int idEmployee);

	public void deleteEmployeeById(int idEmployee);

	public void updateEmployee(Employee employee);
	
	public List<Employee> findAllEmployees();
	
	public void addMark(float mark, int idUser, int idCours);
	
	public float findMarkByIdUserAndIdCours(int idUser, int idCours);
}
