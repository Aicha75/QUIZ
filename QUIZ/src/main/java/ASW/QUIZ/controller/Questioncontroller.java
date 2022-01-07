package ASW.QUIZ.controller;

import ASW.QUIZ.model.Question;
import ASW.QUIZ.service.questionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("question")
public class Questioncontroller {

    final
    questionService QuestionService;

    public Questioncontroller(questionService questionService) {
        QuestionService = questionService;
    }

    @PostMapping ("add")
    public Question add(@RequestBody Question question){
        return QuestionService.add(question);
    }

    @PatchMapping("update")
    public  Question update(@RequestBody Question question){ return QuestionService.update(question); }

    @DeleteMapping("delete")
    public String delete(@RequestBody Question question){
        QuestionService.delete(question);
        return ("QUESTION IS DELETED");

    }

    @GetMapping ("getById/{id}")
    public Optional<Question> getById(@PathVariable int id){
        return QuestionService.findById(id);
    }

    @GetMapping("getAll")
    public List<Question> getAll(){
        return QuestionService.findAll();
    }
}
