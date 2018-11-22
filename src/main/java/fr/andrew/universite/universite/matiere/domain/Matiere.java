package fr.andrew.universite.universite.matiere.domain;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import fr.andrew.universite.universite.note.domain.Note;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_matiere")
    private Integer numeroMatiere;
    @Column(name = "nom")
    private String nom;
    @Column(name = "coef")
    private Integer coef;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_enseignant")
    private Enseignant enseignant;
    @OneToMany(mappedBy = "matiere")
    private List<Note> notes; 
    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroMatiere() {
        return numeroMatiere;
    }

    public void setNumeroMatiere(Integer numeroMatiere) {
        this.numeroMatiere = numeroMatiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCoef() {
        return coef;
    }

    public void setCoef(Integer coef) {
        this.coef = coef;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignants) {
        this.enseignant = enseignants;
    }

}
