package fr.andrew.universite.universite.etudiant.repository;

import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
