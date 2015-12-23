package com.gno.sample.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.gno.sample.dto.Person;


public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>{

}
