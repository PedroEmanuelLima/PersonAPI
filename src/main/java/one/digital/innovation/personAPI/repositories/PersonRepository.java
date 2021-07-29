package one.digital.innovation.personAPI.repositories;

import one.digital.innovation.personAPI.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
