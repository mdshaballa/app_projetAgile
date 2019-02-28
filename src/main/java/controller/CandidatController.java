package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import entity.Candidat;
import repository.CandidatRepository;

@CrossOrigin
@RestController
@RequestMapping("/Candidat")
public class CandidatController {

	@Autowired
	CandidatRepository candidatRepository;

	// Liste des Candidats
	@RequestMapping(value = "/allCandidat", method = RequestMethod.GET)
	@ResponseBody
	public List<Candidat> getAll() {
		return candidatRepository.findAll();
	}

	// Crée un Candidat
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public void save(@RequestBody Candidat candidat) {
		candidatRepository.save(candidat);
	}

	// chercher un candidat par num Candidat
	@RequestMapping(value = "/find/{noCandidat}", method = RequestMethod.GET)
	@ResponseBody
	public Optional<Candidat> getPerson(@PathVariable("noCandidat") String noCandidat) {
		return candidatRepository.findById(noCandidat);
	}

	// suprimer Candidat par noCandidat
	@RequestMapping(value = "/supprimer/{noCandidat}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletCandidat(@PathVariable("noCandidat") String noCandidat) {
		candidatRepository.deleteByNoCandidat(noCandidat);
		return "Candidat " + noCandidat + " est bien Spprimer !!";
	}

	// Liste des Candidats par universiter
	@RequestMapping(value = "/universite/{universiteOrigine}", method = RequestMethod.GET)
	@ResponseBody
	public List<Candidat> getByUniv(@PathVariable("universiteOrigine") String universiteOrigine) {
		return candidatRepository.findByUniversiteOrigine(universiteOrigine);

	}

	// suprimer tout les Candidats
	@RequestMapping(value = "/supprimer/tout", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletCandidat() {
		candidatRepository.deleteCandidat();
		return " tout les candidats sont Spprimer !!";
	}

	// Liste des Candidats par nom
	@RequestMapping(value = "/findByNom/{nom}", method = RequestMethod.GET)
	@ResponseBody
	public Candidat getByNom(@PathVariable("nom") String nom) {
		return candidatRepository.findByNom(nom);

	}

}
