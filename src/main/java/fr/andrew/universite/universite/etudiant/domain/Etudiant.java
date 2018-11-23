package fr.andrew.universite.universite.etudiant.domain;

import fr.andrew.universite.universite.note.domain.Note;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_etudiant")
    private Integer numeroEtudiant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "date_naissance")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateNaissance;
    @Column(name = "sexe")
    private String sexe;
    @OneToMany(mappedBy = "etudiant")
    private List<Note> notes;

}
