package fr.andrew.universite.universite.enseignant.repository;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {

    @Query("UPDATE t_enseignant  SET numero_enseignant = ?1, nom = ?2, prenom = ?3, date_naissance = ?4, sexe = ?5, grade = ?6, date_embauche = ?7 WHERE id = ?8")
    void modifierEnseignantById(Integer numeroEnseignant, String nom, String prenom, Date dateNaissance, String sexe, String grade, Date dateEmbauche, Integer id);
}
