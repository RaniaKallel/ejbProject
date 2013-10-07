package tn.edu.esprit.erpBi.ejbProject.manyToManyWithData;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cours
 *
 */
@Entity

public class Cours implements Serializable {

	
	private int idCours;
	private String nameCours;
	private static final long serialVersionUID = 1L;
	
	private List<Mark> marks;

	public Cours() {
		super();
	}   
	@Id    
	public int getIdCours() {
		return this.idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}   
	public String getNameCours() {
		return this.nameCours;
	}

	public void setNameCours(String nameCours) {
		this.nameCours = nameCours;
	}
	@OneToMany(mappedBy="cours")
	public List<Mark> getMarks() {
		return marks;
	}
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
   
}
