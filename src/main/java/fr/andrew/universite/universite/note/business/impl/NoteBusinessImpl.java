package fr.andrew.universite.universite.note.business.impl;

import fr.andrew.universite.universite.etudiant.business.IEtudiantBusiness;
import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import fr.andrew.universite.universite.matiere.business.IMatiereBusiness;
import fr.andrew.universite.universite.matiere.domain.Matiere;
import fr.andrew.universite.universite.note.business.INoteBusiness;
import fr.andrew.universite.universite.note.domain.Note;
import fr.andrew.universite.universite.note.repository.INoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteBusinessImpl implements INoteBusiness {
    @Autowired
    private INoteRepository noteRepository;

    @Autowired
    private IEtudiantBusiness etudiantBusiness;

    @Autowired
    private IMatiereBusiness matiereBusiness;

    @Override
    public List<Note> finddAll() {

        return noteRepository.findAll() ;
    }

    @Override
    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Etudiant> getEtudiant() {
        List<Etudiant> etudiants = etudiantBusiness.findAll();
        return etudiants;
    }

    @Override
    public List<Matiere> getMatiere() {
        List<Matiere> matieres = matiereBusiness.findAll();
        return matieres;
    }


}
