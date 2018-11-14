package fr.andrew.universite.universite.enseignant.controller.impl;

import fr.andrew.universite.universite.enseignant.business.IEnseignantBusiness;
import fr.andrew.universite.universite.enseignant.controller.IEnseignantController;
import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {

    @Autowired
    private IEnseignantBusiness enseignantBusiness;


    @Override
    @GetMapping(path = "/enseignant")
    public String findAll(Model model) {
        List<Enseignant> enseignants = enseignantBusiness.findAll();
        model.addAttribute("enseignants", enseignants);

        return "enseignant/enseignant";
    }

    @Override
    @GetMapping(path = "/enseignant/detail")
    public String findOneById(Model model, @RequestParam Integer id) {
        Enseignant enseignant = enseignantBusiness.findOneById(id);
        model.addAttribute("enseignant", enseignant);

        return "enseignant/enseignantDetail";
    }
}
