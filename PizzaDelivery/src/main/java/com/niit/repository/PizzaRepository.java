package com.niit.repository;

import com.niit.model.PizzaDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends MongoRepository<PizzaDetails,String> {

}
