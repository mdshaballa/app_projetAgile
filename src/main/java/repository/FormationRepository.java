package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, String>{
	
	
	public Formation findByCodeFormation(String nom);
	public List<Formation> findByNomFormation(String nomFormation);
	
	@Modifying
	@Transactional
	@Query("delete from Formation f where f.codeFormation = ?1")
	public void deleteByCodeFormationt(String codeFormation);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Formation")
	public void deleteFormation();
}
