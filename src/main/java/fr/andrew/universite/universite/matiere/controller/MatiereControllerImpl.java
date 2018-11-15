package fr.andrew.universite.universite.matiere.controller;

import fr.andrew.universite.universite.matiere.business.IMatiereBusiness;
import fr.andrew.universite.universite.matiere.domain.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MatiereControllerImpl implements IMatiereController {

    @Autowired
    private IMatiereBusiness matiereBusiness;

    @Override
    @GetMapping(path = "/matiere", name = "matiere")
    public String findAll(Model model) {
        List<Matiere> matieres = matiereBusiness.findAll();
        model.addAttribute("matieres", matieres);

        return "/matiere/matiere";
    }

    @Override
    @GetMapping(path = "/matiere/detail", name = "detail")
    public String findOneById(Model model, @RequestParam Integer id) {
        Matiere matiere = matiereBusiness.findOneById(id);
        model.addAttribute("matiere", matiere);

        return "/matiere/matiereDetail";
    }

    @Override
    @GetMapping(path = "/matiere/add", name = "add")
    public String add(Model model) {
        model.addAttribute("matiere", new Matiere());

        return "/matiere/matiereAdd";
    }

    @Override
    @PostMapping(path = "/matiere/add", name = "add")
    public String addPost(@ModelAttribute Matiere matiere) {
        matiereBusiness.add(matiere);

        return "redirect:/matiere";
    }

    @Override
    @GetMapping(path = "/matiere/delete", name = "delete")
    public String delete(Integer id) {
        matiereBusiness.delete(id);

        return "redirect:/matiere";
    }

    @Override
    @GetMapping(path = "matiere/modifier", name = "modifier")
    public String modifier(Model model, Integer id) {
        Matiere matiere = matiereBusiness.findOneById(id);
        model.addAttribute("matiere", matiere);

        return "/matiere/matiereModifier";
    }

    @Override
    @PostMapping(path = "matiere/modifier", name = "modifier")
    public String modifierPost(@ModelAttribute Matiere matiere) {
        matiereBusiness.modifier(matiere);

        return "redirect:/matiere";
    }


}
