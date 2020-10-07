package metier;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String theme;
	private Date dateDebut;
	private int duree;
	@ManyToOne(cascade = CascadeType.ALL)
	private Lieu lieu;
	
	public Formation() {
		super();
	}
	
	
	public Formation(String theme, Date dateDebut, int duree, Lieu lieu) {
		super();
		this.theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.lieu = lieu;
	}


	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Formation(String theme) {
		super();
		this.theme = theme;
	}
	
	

}
