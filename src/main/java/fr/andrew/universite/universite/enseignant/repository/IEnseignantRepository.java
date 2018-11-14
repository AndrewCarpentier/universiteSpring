package fr.andrew.universite.universite.enseignant.repository;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {
}
