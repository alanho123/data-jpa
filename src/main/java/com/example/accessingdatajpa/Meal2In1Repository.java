package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Meal2In1Repository extends CrudRepository<Meal2In1, Long> {

}
