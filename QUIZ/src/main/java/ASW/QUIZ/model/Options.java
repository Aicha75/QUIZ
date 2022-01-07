package ASW.QUIZ.model;

import javax.persistence.*;

@Entity
@Table
public class Options {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    private String value;
    private boolean isCorrect;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "IdQuestion",referencedColumnName = "id")
    private  Question question;

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
