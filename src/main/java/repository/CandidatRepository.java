package repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Candidat;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, String>{
     
	public List<Candidat> findByUniversiteOrigine(String universiteOrigine);
	public Candidat findByNom(String nom);
	
	@Modifying
	@Transactional
	@Query("delete from Candidat c where c.noCandidat = ?1")
	public void deleteByNoCandidat(String noCandidat);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Candidat")
	public void deleteCandidat();
}
