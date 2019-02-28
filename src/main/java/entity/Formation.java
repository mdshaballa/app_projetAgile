package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Formation")
@NamedQuery(name = "Enseignant.findByCodeFormation", query = "SELECT f FROM Formation f WHERE f.codeFormation = ?1")
@NamedQuery(name = "Formation.findByNomFormation", query = "SELECT f FROM Formation f WHERE f.nomFormation = ?1")
public class Formation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codeFormation;
	private Date debutAccreditation;
	private String diplome;
	private String doubleDiplome;
	private Date finAccreditation;
	@Column(name="N0_ANNEE")
	private short noAnnee;
	private String nomFormation;
	
	public Formation() {
	}

	public Formation(String codeFormation, Date debutAccreditation, String diplome, String doubleDiplome,
			Date finAccreditation, short noAnnee, String nomFormation) {
		super();
		this.codeFormation = codeFormation;
		this.debutAccreditation = debutAccreditation;
		this.diplome = diplome;
		this.doubleDiplome = doubleDiplome;
		this.finAccreditation = finAccreditation;
		this.noAnnee = noAnnee;
		this.nomFormation = nomFormation;
	}

	public String getCodeFormation() {
		return codeFormation;
	}

	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	public Date getDebutAccreditation() {
		return debutAccreditation;
	}

	public void setDebutAccreditation(Date debutAccreditation) {
		this.debutAccreditation = debutAccreditation;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getDoubleDiplome() {
		return doubleDiplome;
	}

	public void setDoubleDiplome(String doubleDiplome) {
		this.doubleDiplome = doubleDiplome;
	}

	public Date getFinAccreditation() {
		return finAccreditation;
	}

	public void setFinAccreditation(Date finAccreditation) {
		this.finAccreditation = finAccreditation;
	}

	public short getNoAnnee() {
		return noAnnee;
	}

	public void setNoAnnee(short noAnnee) {
		this.noAnnee = noAnnee;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	@Override
	public String toString() {
		return "Formation [codeFormation=" + codeFormation + ", debutAccreditation=" + debutAccreditation + ", diplome="
				+ diplome + ", doubleDiplome=" + doubleDiplome + ", finAccreditation=" + finAccreditation + ", n0Annee="
				+ noAnnee + ", nomFormation=" + nomFormation + "]";
	}
	
	

}
