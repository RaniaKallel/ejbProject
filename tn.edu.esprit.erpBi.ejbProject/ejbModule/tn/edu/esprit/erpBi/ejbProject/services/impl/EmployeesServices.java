package tn.edu.esprit.erpBi.ejbProject.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.manyToManyWithData.Cours;
import tn.edu.esprit.erpBi.ejbProject.manyToManyWithData.Mark;
import tn.edu.esprit.erpBi.ejbProject.manyToManyWithData.User;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesLocal;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;

/**
 * Session Bean implementation class EmployeesServices
 */
@Stateless
public class EmployeesServices implements EmployeesServicesRemote,
		EmployeesServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EmployeesServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);

	}

	@Override
	public Employee findEmployeeById(int idEmployee) {

		return entityManager.find(Employee.class, idEmployee);
	}

	@Override
	public void deleteEmployeeById(int idEmployee) {
		entityManager.remove(findEmployeeById(idEmployee));

	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);

	}

	@Override
	public List<Employee> findAllEmployees() {

		return entityManager.createQuery("select e from Employee e")
				.getResultList();
	}

	@Override
	public void addMark(float mark, int idUser, int idCours) {
		User userFound = entityManager.find(User.class, idUser);
		Cours coursFound = entityManager.find(Cours.class, idCours);

		Mark theMark = new Mark(mark, userFound, coursFound);
		entityManager.persist(theMark);
	}

	@Override
	public float findMarkByIdUserAndIdCours(int idUser, int idCours) {
		String jpql = "select m from Mark m where m.user.idUser= :param1 and m.cours.idCours= :param2";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1",idUser);
		query.setParameter("param2",idCours);
		
		Mark markFound= (Mark) query.getSingleResult();

		return markFound.getMark();
	}

}
