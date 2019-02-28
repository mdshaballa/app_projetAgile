package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Formation;
import repository.FormationRepository;

@CrossOrigin
@RestController
@RequestMapping("/Formation")
public class FormationController {

	@Autowired
	FormationRepository formationRepository;

	// Liste des Formation
	@RequestMapping(value = "/allFormation", method = RequestMethod.GET)
	@ResponseBody
	public List<Formation> getAll() {
		return formationRepository.findAll();
	}

	// Crée un Formation
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public String save(@RequestBody Formation formation) {
		formationRepository.save(formation);
		return "Formation " + formation.getCodeFormation() + " est bien Enregistrer ";
	}

	// Liste des formations par nom
	@RequestMapping(value = "/FindByNomDeFormation/{nomFormation}", method = RequestMethod.GET)
	@ResponseBody
	public List<Formation> getByNom(@PathVariable("nomFormation") String nomFormation) {
		return formationRepository.findByNomFormation(nomFormation);

	}

	// Liste des formations par codeFormation
	@RequestMapping(value = "/CodeFormation/{codeFormation}", method = RequestMethod.GET)
	@ResponseBody
	public Formation getByCodeFormation(@PathVariable("codeFormation") String codeFormation) {
		return formationRepository.findByCodeFormation(codeFormation);

	}

	// suprimer tout les Formations
	@RequestMapping(value = "/supprimer/tout", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletEnseignant() {
		formationRepository.deleteFormation();
		return " tout les Formation sont Spprimer !!";
	}

	// suprimer Formation par codeFormation
	@RequestMapping(value = "/supprimer/{codeFormation}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletCandidat(@PathVariable("codeFormation") String codeFormation) {
		formationRepository.deleteByCodeFormationt(codeFormation);
		return "Formation " + codeFormation + " est bien Spprimer !!";
	}

	// Update Formation par codeFormation
	@RequestMapping(value = "/update/{codeFormation}", method = RequestMethod.PUT)
	@ResponseBody
	public Formation UpdateFormation(@PathVariable("codeFormation") String codeFormation,@RequestParam String nomFormation, 
            @RequestParam String diplome) {
		Formation F = formationRepository.findByCodeFormation(codeFormation);
		F.setNomFormation(nomFormation);
		F.setDiplome(diplome);
		formationRepository.save(F);
		return F;
	}

}
