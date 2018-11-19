package fr.andrew.universite.universite.note.repository;

import fr.andrew.universite.universite.note.domain.Note;
import fr.andrew.universite.universite.note.domain.NotePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends JpaRepository<Note, NotePk> {
}
