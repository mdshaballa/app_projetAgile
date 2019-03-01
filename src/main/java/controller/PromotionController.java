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

import entity.Promotion;
import repository.PromotionRepository;

@CrossOrigin
@RestController
@RequestMapping("/Promotion")
public class PromotionController {

	@Autowired
	PromotionRepository promotionRepository;

	// Liste des Promotions
	@RequestMapping(value = "/allPromotion", method = RequestMethod.GET)
	@ResponseBody
	public List<Promotion> getAll() {
		return promotionRepository.findAll();
	}

	// Liste des Promotion par codeFormation et anneeUniversitaire
	@RequestMapping(value = "/findFormation/{codeFormation}/{anneeUniversitaire}", method = RequestMethod.GET)
	@ResponseBody
	public Promotion getByNom(@PathVariable("codeFormation") String codeFormation,
			@PathVariable("anneeUniversitaire") String anneeUniversitaire) {
		return promotionRepository.findByCodeFormationAnneeUniv(codeFormation, anneeUniversitaire);

	}

	// Liste des Promotion par Sigle
	@RequestMapping(value = "/sigle/{siglePromotion}", method = RequestMethod.GET)
	@ResponseBody
	public Promotion getBySiglePromotion(@PathVariable("siglePromotion") String siglePromotion) {
		return promotionRepository.findBySiglePromotion(siglePromotion);

	}

	// Liste des Promotion lieuRentree
	@RequestMapping(value = "/lieuRentree/{lieuRentree}", method = RequestMethod.GET)
	@ResponseBody
	public List<Promotion> getByLieuRentree(@PathVariable("lieuRentree") String lieuRentree) {
		return promotionRepository.findByLieuRentree(lieuRentree);

	}
	
	// Crée un Promotion
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		@ResponseBody
		public String save(@RequestBody Promotion promotion) {
			promotionRepository.save(promotion);
			return "Formation " + promotion.getAnneeUniversitaire() + " est bien Enregistrer ";
		}

	// suprimer tout les Promotions
	@RequestMapping(value = "/supprimer/tout", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletEnseignant() {
		promotionRepository.deletePromotion();
		return " tout les Promotions sont Spprimer !!";
	}

	// suprimer Promotion par codeFormation et anneeUniversitaire
	@RequestMapping(value = "/supprimer/{codeFormation}/{anneeUniversitaire}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deletPromotion(@PathVariable("codeFormation") String codeFormation,
			@PathVariable("anneeUniversitaire") String anneeUniversitaire) {
		promotionRepository.deleteByCodeFormationAnneeUniv(codeFormation, anneeUniversitaire);
		return "Promotion where codeFormation =  " + codeFormation + " and codeFormation = " + anneeUniversitaire
				+ " est bien Spprimer !!";
	}

}
