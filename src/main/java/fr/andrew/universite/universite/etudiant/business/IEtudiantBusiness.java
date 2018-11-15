package fr.andrew.universite.universite.etudiant.business;

import fr.andrew.universite.universite.etudiant.domain.Etudiant;

import java.util.List;

public interface IEtudiantBusiness {

    List<Etudiant> findAll();

}
