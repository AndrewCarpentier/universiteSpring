package fr.andrew.universite.universite.enseignant.controller.impl;

import fr.andrew.universite.universite.enseignant.business.IEnseignantBusiness;
import fr.andrew.universite.universite.enseignant.controller.IEnseignantController;
import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {

    @Autowired
    private IEnseignantBusiness enseignantBusiness;


    @Override
    @GetMapping(path = "/enseignant", name = "enseignant")
    public String findAll(Model model) {
        List<Enseignant> enseignants = enseignantBusiness.findAll();
        model.addAttribute("enseignants", enseignants);

        return "enseignant/enseignant";
    }

    @Override
    @GetMapping(path = "/enseignant/detail", name = "detail")
    public String findOneById(Model model, @RequestParam Integer id) {
        Enseignant enseignant = enseignantBusiness.findOneById(id);
        model.addAttribute("enseignant", enseignant);

        return "enseignant/enseignantDetail";
    }

    @Override
    @GetMapping(path = "/enseignant/add", name = "add")
    public String add(Model model) {
        Enseignant enseignant = new Enseignant();
        enseignant.setSexe("M");
        model.addAttribute("enseignant", enseignant);


        return "enseignant/enseignantAdd";
    }

    @Override
    @PostMapping(path = "/enseignant/add", name = "add")
    public String addPost(@ModelAttribute Enseignant enseignant) {
        enseignantBusiness.add(enseignant);

        return "redirect:/enseignant";
    }

    @Override
    @GetMapping(path = "/enseignant/delete", name = "delete")
    public String delete(@RequestParam Integer id) {
        enseignantBusiness.delete(id);

        return "redirect:/enseignant";
    }

    @Override
    @GetMapping(path = "/enseignant/modifier", name = "modifier")
    public String modifier(Model model, @RequestParam Integer id) {
        Enseignant enseignant = enseignantBusiness.findOneById(id);
        model.addAttribute("enseignant", enseignant);

        return "/enseignant/enseignantModifier";
    }

    @Override
    @PostMapping(path = "/enseignant/modifier", name = "modifier")
    public String modifierPost(Enseignant enseignant) {
        enseignantBusiness.modifier(enseignant);

        return "redirect:/enseignant";

    }

}
