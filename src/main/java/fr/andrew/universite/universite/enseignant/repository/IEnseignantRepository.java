package fr.andrew.universite.universite.enseignant.repository;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {
}
