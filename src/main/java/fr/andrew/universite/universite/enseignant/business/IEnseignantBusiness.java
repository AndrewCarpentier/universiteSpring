package fr.andrew.universite.universite.enseignant.business;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;

import java.util.List;

public interface IEnseignantBusiness {

    List<Enseignant> findAll();
    Enseignant findOneById(Integer id);
}
