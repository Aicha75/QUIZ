package ASW.QUIZ.controller;

import ASW.QUIZ.model.Collection;
import ASW.QUIZ.service.collectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("collection")
public class Collectioncontroller {

    final
    collectionService CollectionService;

    public Collectioncontroller(collectionService collectionService) {
        CollectionService = collectionService;
    }

    @PostMapping("add")
    public Collection add(@RequestBody Collection collection){
        return CollectionService.add(collection);
    }

    @PatchMapping("update")
    public  Collection update(@RequestBody Collection collection){ return CollectionService.update(collection); }

    @DeleteMapping("delete")
    public String delete(@RequestBody Collection collection){
        CollectionService.delete(collection);
        return ("COLLECTION IS DELETED");

    }

    @GetMapping ("getById/{id}")
    public Optional<Collection> getById(@PathVariable int id){
        return CollectionService.findById(id);
    }

    @GetMapping("getAll")
    public List<Collection> getAll(){
        return CollectionService.findAll();
    }

}
