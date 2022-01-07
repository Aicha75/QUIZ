package ASW.QUIZ.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table

public class Collection {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    @OneToMany
    @JoinColumn(name = "QuizId",referencedColumnName = "id")
    private Set<Quiz>quizs = new HashSet<>();
    private String nom;

    public int getId() {
        return id;
    }



    public Set<Quiz> getQuizs() {
        return quizs;
    }

    public void setQuizs(Set<Quiz> quizs) {
        this.quizs = quizs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

