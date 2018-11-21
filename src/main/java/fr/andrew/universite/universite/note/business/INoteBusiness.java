package fr.andrew.universite.universite.note.business;


import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import fr.andrew.universite.universite.matiere.domain.Matiere;
import fr.andrew.universite.universite.note.domain.Note;

import java.util.List;

public interface INoteBusiness {

    List<Note> finddAll();
    Note addNote(Note note);
    List<Etudiant> getEtudiant();
    List<Matiere> getMatiere();

}


