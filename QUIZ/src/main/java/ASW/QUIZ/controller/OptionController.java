package ASW.QUIZ.controller;

import ASW.QUIZ.model.Options;
import ASW.QUIZ.service.OptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("option")
public class OptionController {
    final
    OptionService OptionsService;

    public OptionController(OptionService optionsService) {
        OptionsService = optionsService;
    }


    @PostMapping("add")
    public Options add(@RequestBody Options options){
        return OptionsService.add(options);
    }

    @PatchMapping("update")
    public  Options update(@RequestBody Options options){ return OptionsService.update(options); }

    @DeleteMapping("delete")
    public String delete(@RequestBody Options options){
        OptionsService.delete(options);
        return ("Option IS DELETED");
    }

    @GetMapping("getById/{id}")
    public Optional<Options> getById(@PathVariable int id){
        return OptionsService.finById(id);
    }

    @GetMapping("getAll")
    public List<Options> getAll(){
        return OptionsService.findAll();
    }
}
