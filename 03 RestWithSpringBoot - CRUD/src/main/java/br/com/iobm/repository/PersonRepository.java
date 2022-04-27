package br.com.iobm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.iobm.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
