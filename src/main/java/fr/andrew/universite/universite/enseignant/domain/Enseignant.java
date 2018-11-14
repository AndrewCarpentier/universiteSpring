package fr.andrew.universite.universite.enseignant.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity(name = "t_enseignant")
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_enseignant")
    private Integer numeroEnseignant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "dateNaissance")
    private String dateNaissance;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "grade")
    private String grade;
    @Column(name = "date_embauche")
    private String dateEmbauche;

    public Enseignant() {
    }

    public Enseignant(Integer numeroEnseignant, String nom, String prenom, String dateNaissance, String sexe, String grade, String dateEmbauche) {
        this.numeroEnseignant = numeroEnseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.grade = grade;
        this.dateEmbauche = dateEmbauche;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroEnseignant() {
        return numeroEnseignant;
    }

    public void setNumeroEnseignant(Integer numeroEnseignant) {
        this.numeroEnseignant = numeroEnseignant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }


}
