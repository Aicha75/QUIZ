package ASW.QUIZ.repository;

import ASW.QUIZ.model.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Options, Integer> {
}
