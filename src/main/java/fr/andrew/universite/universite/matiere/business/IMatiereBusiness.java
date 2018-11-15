package fr.andrew.universite.universite.matiere.business;


import fr.andrew.universite.universite.matiere.domain.Matiere;

import java.util.List;

public interface IMatiereBusiness {

    List<Matiere> findAll();
    Matiere findOneById(Integer id);
    Matiere add(Matiere matiere);
    Void delete(Integer id);
    Matiere modifier(Matiere matiere);

}
