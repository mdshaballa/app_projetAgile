package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Promotion;
import entity.PromotionPK;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, PromotionPK>{



	@Modifying
	@Transactional
	@Query("DELETE FROM Promotion")
	public void deletePromotion();
	
	@Modifying
	@Transactional
	@Query("delete from Promotion p where p.formation.codeFormation = ?1 and p.anneeUniversitaire = ?2")
	public void deleteByCodeFormationAnneeUniv(String codeFormation, String anneeUniversitaire);

	@Query("SELECT p from Promotion p where p.formation.codeFormation = ?1 and p.anneeUniversitaire = ?2")
	public Promotion findByCodeFormationAnneeUniv(String codeFormation, String anneeUniversitaire);
	
	@Query("SELECT p from Promotion p where p.siglePromotion = ?1")
	public Promotion findBySiglePromotion(String SiglePromotion);
	
	@Query("SELECT p from Promotion p where p.lieuRentree = ?1")
	public List<Promotion> findByLieuRentree(String lieuRentree);
}


