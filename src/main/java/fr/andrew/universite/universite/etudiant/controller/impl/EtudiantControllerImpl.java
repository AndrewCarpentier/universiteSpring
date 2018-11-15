package fr.andrew.universite.universite.etudiant.controller.impl;

import fr.andrew.universite.universite.etudiant.business.IEtudiantBusiness;
import fr.andrew.universite.universite.etudiant.controller.IEtudiantController;
import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {

    @Autowired
    private IEtudiantBusiness etudiantBusiness;

    @Override
    @GetMapping(path = "/etudiant", name = "etudiant")
    public String findAll(Model model) {
        List<Etudiant> etudiant = etudiantBusiness.findAll();
        model.addAttribute("etudiant", etudiant);

        return "etudiant";
    }
}
