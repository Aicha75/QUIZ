package ASW.QUIZ.service;

import ASW.QUIZ.model.Question;
import ASW.QUIZ.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class questionService {

    final
    QuestionRepository QuestionRepository;

    public questionService(QuestionRepository questionRepository) {
        QuestionRepository = questionRepository;
    }
    public Question add(Question question){
        return QuestionRepository.save(question);
    }
    public Question update(Question question){
        return QuestionRepository.save(question);
    }
    public void delete(Question question){
        QuestionRepository.delete(question);
    }
    public List<Question> findAll(){
        return QuestionRepository.findAll();
    }
    public Optional<Question> findById(int id){
        return QuestionRepository.findById(id);
    }

}
