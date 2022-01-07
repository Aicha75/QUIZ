package ASW.QUIZ.service;

import ASW.QUIZ.model.Collection;
import ASW.QUIZ.repository.CollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class collectionService {
    final
    CollectionRepository CollectionRepository;


    public collectionService(CollectionRepository collectionRepository) {
        CollectionRepository = collectionRepository;
    }

    public Collection add(Collection collection){
       return CollectionRepository.save(collection);
    }
    public Collection update(Collection collection){
        return CollectionRepository.save(collection);
    }
    public void delete(Collection collection){
        CollectionRepository.delete(collection);
    }

    public List<Collection> findAll(){
        return CollectionRepository.findAll();
    }
    public Optional<Collection> findById(int id){
        return CollectionRepository.findById(id);
    }
}
