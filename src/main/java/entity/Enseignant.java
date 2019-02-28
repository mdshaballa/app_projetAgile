package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "Enseignant.findByNoEnseignant", query = "SELECT e FROM Enseignant e WHERE e.noEnseignant = ?1")
@NamedQuery(name = "Enseignant.findByNom", query = "SELECT e FROM Enseignant e WHERE e.nom = ?1")
@NamedQuery(name = "Enseignant.findByEmailUbo", query = "SELECT e FROM Enseignant e WHERE e.emailUbo = ?1")
@Table(name = "Enseignant")
public class Enseignant implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="NO_ENSEIGNANT")
	private long noEnseignant;
	private String adresse;
	private String codePostal;
	private String emailPerso;
	private String emailUbo;
	private String mobile;
	private String nom;
	private String pays;
	private String prenom;
	private String sexe;
	private String telephone;
	private String type;
	private String ville;
	
	public Enseignant() {
		
	}

	public Enseignant(long noEnseignant, String adresse, String codePostal, String emailPerso, String emailUbo,
			String mobile, String nom, String pays, String prenom, String sexe, String telephone, String type,
			String ville) {
		super();
		this.noEnseignant = noEnseignant;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.emailPerso = emailPerso;
		this.emailUbo = emailUbo;
		this.mobile = mobile;
		this.nom = nom;
		this.pays = pays;
		this.prenom = prenom;
		this.sexe = sexe;
		this.telephone = telephone;
		this.type = type;
		this.ville = ville;
	}

	public long getNoEnseignant() {
		return noEnseignant;
	}

	public void setNoEnseignant(long noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getEmailPerso() {
		return emailPerso;
	}

	public void setEmailPerso(String emailPerso) {
		this.emailPerso = emailPerso;
	}

	public String getEmailUbo() {
		return emailUbo;
	}

	public void setEmailUbo(String emailUbo) {
		this.emailUbo = emailUbo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Enseignant [noEnseignant=" + noEnseignant + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", emailPerso=" + emailPerso + ", emailUbo=" + emailUbo + ", mobile=" + mobile + ", nom=" + nom
				+ ", pays=" + pays + ", prenom=" + prenom + ", sexe=" + sexe + ", telephone=" + telephone + ", type="
				+ type + ", ville=" + ville + "]";
	}
	
}
