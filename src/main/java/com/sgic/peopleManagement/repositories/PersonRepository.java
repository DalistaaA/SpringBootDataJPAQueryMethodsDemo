package com.sgic.peopleManagement.repositories;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.sgic.peopleManagement.entities.Person;

public interface PersonRepository extends Repository<Person, Integer>{

	List<Person> findByLastName(String lastName);
	
	List<Person> findByFirstNameAndEmail(String firstName, String email);
	
}
