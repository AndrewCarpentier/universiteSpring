package fr.andrew.universite.universite.matiere.domain;

import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import fr.andrew.universite.universite.note.domain.Note;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
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
}
