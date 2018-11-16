package fr.andrew.universite.universite.matiere.domain;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;

import javax.persistence.*;
import java.util.ArrayList;
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
    @OneToOne
    @JoinColumn(name = "id_enseignant")
    private Enseignant enseignants = new Enseignant();

    public Matiere() {
    }

    public Matiere(Integer numeroMatiere, String nom, Integer coef, Enseignant enseignants) {
        this.numeroMatiere = numeroMatiere;
        this.nom = nom;
        this.coef = coef;
        this.enseignants = enseignants;
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

    public Enseignant getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Enseignant enseignants) {
        this.enseignants = enseignants;
    }
}
