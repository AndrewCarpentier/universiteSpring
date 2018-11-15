package fr.andrew.universite.universite.matiere.repository;

import fr.andrew.universite.universite.matiere.domain.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer > {
}
