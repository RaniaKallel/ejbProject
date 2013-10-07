package tn.edu.esprit.erpBi.ejbProject.enheritance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Visitor
 *
 */
@Entity

public class Visitor  extends Profile implements Serializable {

	
	private String privilege;
	private static final long serialVersionUID = 1L;

	public Visitor() {
		super();
	}   
	public String getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
   
}
