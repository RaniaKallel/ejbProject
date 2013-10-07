package tn.edu.esprit.erpBi.ejbProject.manyToManyWithData;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Mark
 *
 */
@Entity

public class Mark implements Serializable {

	private MarkPk markPk;
	private float mark;
	private static final long serialVersionUID = 1L;
	
	 private User user;
	 private Cours cours;
	 
	public Mark() {
		super();
	}   
	public float getMark() {
		return this.mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}
	@EmbeddedId
	public MarkPk getMarkPk() {
		return markPk;
	}
	public void setMarkPk(MarkPk markPk) {
		this.markPk = markPk;
	}
	@ManyToOne
	@JoinColumn(name="idUser", referencedColumnName="idUser", insertable= false, updatable=false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	@JoinColumn(name="idCours", referencedColumnName="idCours", insertable= false, updatable=false)
	public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	public Mark( float mark, User user, Cours cours) {
		super();
		this.markPk = new MarkPk(user.getIdUser(), cours.getIdCours()) ;
		this.mark = mark;
		this.user = user;
		this.cours = cours;
	}
   
}
