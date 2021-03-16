package codegym.repository;

import codegym.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}
