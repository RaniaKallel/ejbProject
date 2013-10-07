package tn.edu.esprit.erpBi.ejbProject.enheritance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Profile
 *
 */
@Entity
//@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy= InheritanceType.JOINED)

public class Profile implements Serializable {

	
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Profile() {
		super();
	}   
	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
