package fr.andrew.universite.universite.enseignant.controller;

import org.springframework.ui.Model;

public interface IEnseignantController {

    String findAll(Model model);
    String findOneById(Model model, Integer id);
}
