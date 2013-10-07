package tn.edu.esprit.erpBi.ejbProject.enheritance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends Profile implements Serializable {

	
	private String role;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
   
}
