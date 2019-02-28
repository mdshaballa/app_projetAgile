package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Enseignant;
import repository.EnseignantRepository;

@CrossOrigin
@RestController
@RequestMapping("/Enseignant")
public class EnseignantController {

	@Autowired
	EnseignantRepository enseignantRepository;

	// Liste des Enseignant
	@RequestMapping(value = "/allEnseignant", method = RequestMethod.GET)
	@ResponseBody
	public List<Enseignant> getAll() {
		return enseignantRepository.findAll();
	}

	// chercher un Enseignant par num Enseignant
	@RequestMapping(value = "/find/{noEnseignant}", method = RequestMethod.GET)
	@ResponseBody
	public Enseignant getPerson(@PathVariable("noEnseignant") long noEnseignant) {
		return enseignantRepository.findByNoEnseignant(noEnseignant);
	}

	// Liste des Enseignants par emailUbo
	@RequestMapping(value = "/emailUbo/{emailUbo}", method = RequestMethod.GET)
	@ResponseBody
	public Enseignant getByEmailUbo(@PathVariable("emailUbo") String emailUbo) {
		return enseignantRepository.findByEmailUbo(emailUbo);

	}

	// Liste des Enseignants par nom
	@RequestMapping(value = "/findByNom/{nom}", method = RequestMethod.GET)
	@ResponseBody
	public Enseignant getByNom(@PathVariable("nom") String nom) {
		return enseignantRepository.findByNom(nom);

	}

	// suprimer tout les Enseignant
	@RequestMapping(value = "/supprimer/tout", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletEnseignant() {
		enseignantRepository.deleteEnseignant();
		return " tout les Enseignant sont Spprimer !!";
	}

	// suprimer Candidat par noCandidat
	@RequestMapping(value = "/supprimer/{noEnseignant}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletCandidat(@PathVariable("noEnseignant") long noEnseignant) {
		enseignantRepository.deleteByNoEnseignant(noEnseignant);
		return "Enseignant " + noEnseignant + " est bien Spprimer !!";
	}
    
	
	// Enregistrer un Enseignant
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		@ResponseBody
		public String save(@RequestBody Enseignant enseignant) {
			enseignantRepository.save(enseignant);
			return "Enseignant " + enseignant.getNom() + " est bien Enregistrer ";
		}
}
