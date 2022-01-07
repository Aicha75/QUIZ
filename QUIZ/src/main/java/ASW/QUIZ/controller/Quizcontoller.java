package ASW.QUIZ.controller;

import ASW.QUIZ.model.Quiz;
import ASW.QUIZ.service.quizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("quiz")
public class Quizcontoller {
    final
    quizService QuizService;

    public Quizcontoller(quizService quizService) {
        QuizService = quizService;
    }


    @PostMapping("add")
    public Quiz add(@RequestBody Quiz quiz){
        return QuizService.add(quiz);
    }

    @PatchMapping("update")
    public  Quiz update(@RequestBody Quiz quiz){ return QuizService.update(quiz); }

    @DeleteMapping("delete")
    public String delete(@RequestBody Quiz quiz){
        QuizService.delete(quiz);
        return ("QUIZ IS DELETED");
    }

    @GetMapping("getById/{id}")
    public Optional<Quiz> getById(@PathVariable int id){
        return QuizService.findById(id);
    }

    @GetMapping("getAll")
    public List<Quiz> getAll(){
        return QuizService.findAll();
    }
}
