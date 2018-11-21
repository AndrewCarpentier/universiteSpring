package fr.andrew.universite.universite.enseignant.controller;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import org.springframework.ui.Model;

public interface IEnseignantController {

    String findAll(Model model);
    String findOneById(Model model, Integer id);
    String add(Model model);
    String addPost(Enseignant enseignant);
    String delete(Integer id);
    String modifier(Model model, Integer id);
    String modifierPost(Enseignant enseignant);


}
