package ASW.QUIZ.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table

public class Quiz {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
     int id;
    @OneToMany
    @JoinColumn(name = "Question",referencedColumnName = "id")
    Set<Question> questions = new HashSet<>();
    private String nom;

    @ManyToOne
    @JoinColumn(name = "CollectionId",referencedColumnName = "id")
    private Collection collection;

    public int getId() {
        return id;
    }



    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
