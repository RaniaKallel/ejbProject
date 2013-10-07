package tn.edu.esprit.erpBi.ejbProject.manyToManyWithData;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MarkPk  implements Serializable{

	private int idUser;
	private int idCours;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCours;
		result = prime * result + idUser;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarkPk other = (MarkPk) obj;
		if (idCours != other.idCours)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	public MarkPk(int idUser, int idCours) {
		super();
		this.idUser = idUser;
		this.idCours = idCours;
	}
	public MarkPk() {
		// TODO Auto-generated constructor stub
	}
	
}
