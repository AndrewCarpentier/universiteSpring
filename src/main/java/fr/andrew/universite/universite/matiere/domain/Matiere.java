package fr.andrew.universite.universite.matiere.domain;

import javax.persistence.*;

@Entity(name = "t_matiere")
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
    @Column(name = "id_enseignant")
    private Integer idEnseignant;

    public Matiere() {
    }

    public Matiere(Integer numeroMatiere, String nom, Integer coef, Integer idEnseignant) {
        this.numeroMatiere = numeroMatiere;
        this.nom = nom;
        this.coef = coef;
        this.idEnseignant = idEnseignant;
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

    public Integer getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Integer idEnseignant) {
        this.idEnseignant = idEnseignant;
    }
}
