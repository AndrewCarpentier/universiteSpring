package fr.andrew.universite.universite.enseignant.domain;

import fr.andrew.universite.universite.matiere.domain.Matiere;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_enseignant")
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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateNaissance;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "grade")
    private String grade;
    @Column(name = "date_embauche")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateEmbauche;
    @OneToMany(mappedBy = "enseignant")
    private List<Matiere> matieres;

}
