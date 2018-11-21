package fr.andrew.universite.universite.note.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class NotePk implements Serializable {
    @Column(name = "id_etudiant")
    private Integer etudiant;
    @Column(name = "id_matiere")
    private Integer matiere;

    public void setEtudiant(Integer etudiant) {
        this.etudiant = etudiant;
    }

    public void setMatiere(Integer matiere) {
        this.matiere = matiere;
    }

    public Integer getEtudiant() {
        return etudiant;
    }

    public Integer getMatiere() {
        return matiere;
    }
}
