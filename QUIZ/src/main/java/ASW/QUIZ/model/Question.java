package ASW.QUIZ.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table

public class Question {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   int id;
   @OneToMany(mappedBy = "value")
   private Set<Options> options = new HashSet<>();
   private String reponse;

   @ManyToOne
   @JoinColumn(name = "QuizId",referencedColumnName = "id")
   private Quiz quiz;

   public int getId() {
      return id;
   }




   public Set<Options> getOptions() {
      return options;
   }

   public void setOptions(Set<Options> options) {
      this.options = options;
   }

   public String getReponse() {
      return reponse;
   }

   public void setReponse(String reponse) {
      this.reponse = reponse;
   }

   public Quiz getQuiz() {
      return quiz;
   }

   public void setQuiz(Quiz quiz) {
      this.quiz = quiz;
   }
}
