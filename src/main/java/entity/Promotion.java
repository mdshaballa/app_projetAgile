package entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROMOTION", schema = "SPIDB", catalog = "")
public class Promotion {
	@EmbeddedId
	private PromotionPK id;
	@Column(name = "ANNEE_UNIVERSITAIRE", insertable = false, updatable = false)
	private String anneeUniversitaire;
	@Column(name = "SIGLE_PROMOTION")
	private String siglePromotion;
	@Column(name = "NB_MAX_ETUDIANT")
	private Short nbMaxEtudiant;
	@Column(name = "DATE_REPONSE_LP")
	private Timestamp dateReponseLp;
	@Column(name = "DATE_REPONSE_LALP")
	private Timestamp dateReponseLalp;
	@Column(name = "DATE_RENTREE")
	private Timestamp dateRentree;
	@Column(name = "LIEU_RENTREE")
	private String lieuRentree;
	@Column(name = "PROCESSUS_STAGE")
	private String processusStage;
	@Column(name = "COMMENTAIRE")
	private String commentaire;
	@JoinColumn(name = "NO_ENSEIGNANT")
	@ManyToOne
	private Enseignant noEnseignant;
	@JoinColumn(name = "CODE_FORMATION", insertable = false, updatable = false)
	@ManyToOne
	private Formation formation;

	public Promotion() {
	}

	public Promotion(PromotionPK id, String anneeUniversitaire, String siglePromotion, Short nbMaxEtudiant,
			Timestamp dateReponseLp, Timestamp dateReponseLalp, Timestamp dateRentree, String lieuRentree,
			String processusStage, String commentaire, Enseignant noEnseignant, Formation formation) {
		super();
		this.id = id;
		this.anneeUniversitaire = anneeUniversitaire;
		this.siglePromotion = siglePromotion;
		this.nbMaxEtudiant = nbMaxEtudiant;
		this.dateReponseLp = dateReponseLp;
		this.dateReponseLalp = dateReponseLalp;
		this.dateRentree = dateRentree;
		this.lieuRentree = lieuRentree;
		this.processusStage = processusStage;
		this.commentaire = commentaire;
		this.noEnseignant = noEnseignant;
		this.formation = formation;
	}

	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public String getSiglePromotion() {
		return siglePromotion;
	}

	public void setSiglePromotion(String siglePromotion) {
		this.siglePromotion = siglePromotion;
	}

	public Short getNbMaxEtudiant() {
		return nbMaxEtudiant;
	}

	public void setNbMaxEtudiant(Short nbMaxEtudiant) {
		this.nbMaxEtudiant = nbMaxEtudiant;
	}

	public Timestamp getDateReponseLp() {
		return dateReponseLp;
	}

	public void setDateReponseLp(Timestamp dateReponseLp) {
		this.dateReponseLp = dateReponseLp;
	}

	public Timestamp getDateReponseLalp() {
		return dateReponseLalp;
	}

	public void setDateReponseLalp(Timestamp dateReponseLalp) {
		this.dateReponseLalp = dateReponseLalp;
	}

	public Timestamp getDateRentree() {
		return dateRentree;
	}

	public void setDateRentree(Timestamp dateRentree) {
		this.dateRentree = dateRentree;
	}

	public String getLieuRentree() {
		return lieuRentree;
	}

	public void setLieuRentree(String lieuRentree) {
		this.lieuRentree = lieuRentree;
	}

	public String getProcessusStage() {
		return processusStage;
	}

	public void setProcessusStage(String processusStage) {
		this.processusStage = processusStage;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public PromotionPK getId() {
		return this.id;
	}

	public void setId(PromotionPK id) {
		this.id = id;
	}

	public Enseignant getNoEnseignant() {
		return noEnseignant;
	}

	public void setNoEnseignant(Enseignant noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", anneeUniversitaire=" + anneeUniversitaire + ", siglePromotion="
				+ siglePromotion + ", nbMaxEtudiant=" + nbMaxEtudiant + ", dateReponseLp=" + dateReponseLp
				+ ", dateReponseLalp=" + dateReponseLalp + ", dateRentree=" + dateRentree + ", lieuRentree="
				+ lieuRentree + ", processusStage=" + processusStage + ", commentaire=" + commentaire
				+ ", noEnseignant=" + noEnseignant + ", formation=" + formation + "]";
	}

}
