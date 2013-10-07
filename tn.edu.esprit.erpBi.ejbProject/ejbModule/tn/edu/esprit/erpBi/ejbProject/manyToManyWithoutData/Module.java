package tn.edu.esprit.erpBi.ejbProject.manyToManyWithoutData;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Module
 *
 */
@Entity

public class Module implements Serializable {

	
	private int idModule;
	private String nameModule;
	private static final long serialVersionUID = 1L;
	
	private List<Student> students;

	public Module() {
		super();
	}   
	@Id    
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}   
	public String getNameModule() {
		return this.nameModule;
	}

	public void setNameModule(String nameModule) {
		this.nameModule = nameModule;
	}
	@ManyToMany
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
   
}
