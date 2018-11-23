package fr.andrew.universite.universite.note.domain;

import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import fr.andrew.universite.universite.matiere.domain.Matiere;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "noter")
public class Note {

    @EmbeddedId
    private NotePk notePk;

    @Column(name = "note")
    private Double noteValue;
    @ManyToOne
    @JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
    private Etudiant etudiant;
    @ManyToOne
    @JoinColumn(name = "id_matiere", insertable = false, updatable = false)
    private Matiere matiere;

}
