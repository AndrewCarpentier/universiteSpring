package fr.andrew.universite.universite.note.domain;

import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import fr.andrew.universite.universite.matiere.domain.Matiere;
import javax.persistence.*;


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

    public NotePk getNotePk() {
        return notePk;
    }

    public void setNotePk(NotePk notePk) {
        this.notePk = notePk;
    }

    public Double getNoteValue() {
        return noteValue;
    }

    public void setNoteValue(Double noteValue) {
        this.noteValue = noteValue;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
}
