package ASW.QUIZ.service;

import ASW.QUIZ.model.Options;
import ASW.QUIZ.repository.OptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OptionService {
    final
    OptionRepository optionRepository;

    public OptionService(OptionRepository optionRepository) {
        this.optionRepository = optionRepository;
    }

    public Options add(Options option){
        return optionRepository.save(option);
    }
    public  Options update(Options option){
        return  optionRepository.save(option);
    }
    public void delete(Options option){
        optionRepository.delete(option);
    }
    public Optional<Options> finById(int id){
        return optionRepository.findById(id);
    }
    public List<Options> findAll(){
        return optionRepository.findAll();
    }
}
