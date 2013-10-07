package tn.edu.esprit.erpBi.ejbProject.manyToManyWithData;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	private int idUser;
	private String nameUser;
	private static final long serialVersionUID = 1L;
	
	private List<Mark> marks;

	public User() {
		super();
	}   
	@Id    
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public String getNameUser() {
		return this.nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	@OneToMany(mappedBy="user")
	public List<Mark> getMarks() {
		return marks;
	}
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
   
}
