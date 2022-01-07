package ASW.QUIZ.service;

import ASW.QUIZ.model.Quiz;
import ASW.QUIZ.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class quizService {

    final
    QuizRepository QuizRepository;

    public quizService(QuizRepository quizRepository) {
         QuizRepository = quizRepository;
    }
    public Quiz add(Quiz quiz){
      return QuizRepository.save(quiz);
    }
    public Quiz update(Quiz quiz){
        return QuizRepository.save(quiz);
    }
    public void delete(Quiz quiz){
        QuizRepository.delete(quiz);
    }
    public Optional<Quiz> findById(int id){
        return QuizRepository.findById(id);
    }
    public List<Quiz> findAll(){
        return  QuizRepository.findAll();
    }
}
