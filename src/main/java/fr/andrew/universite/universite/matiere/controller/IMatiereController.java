package fr.andrew.universite.universite.matiere.controller;

import fr.andrew.universite.universite.matiere.domain.Matiere;
import org.springframework.ui.Model;

public interface IMatiereController {

   String findAll(Model model);
   String findOneById(Model model, Integer id);
   String add(Model model);
   String addPost(Matiere matiere);
   String delete(Integer id);
   String modifier(Model model, Integer id);
   String modifierPost(Matiere matiere);

}
