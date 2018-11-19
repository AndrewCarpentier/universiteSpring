package fr.andrew.universite.universite.note.controller.impl;

import fr.andrew.universite.universite.note.business.INoteBusiness;
import fr.andrew.universite.universite.note.controller.INoteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoteControllerImpl implements INoteController {

    @Autowired
    private INoteBusiness noteBusiness;

    @Override
    @GetMapping(path = "/note", name = "note")
    public String findAll(Model model) {
        model.addAttribute("note", noteBusiness.finddAll());

        return "/note/note";
    }
}
