package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Enseignant;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

	public Enseignant findByNoEnseignant(long noEnseignant);
	public Enseignant findByNom(String nom);
	public Enseignant findByEmailUbo(String emailUbo);
	
	@Modifying
	@Transactional
	@Query("delete from Enseignant e where e.noEnseignant = ?1")
	public void deleteByNoEnseignant(long noEnseignant);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Enseignant")
	public void deleteEnseignant();
}
