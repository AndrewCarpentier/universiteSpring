package fr.andrew.universite.universite.note.business.impl;

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

    @Override
    public List<Note> finddAll() {

        return noteRepository.findAll() ;
    }


}
