package com.niit.service;

import com.niit.model.PizzaDetails;
import com.niit.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService
{

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public PizzaDetails savePizzaDetails(PizzaDetails pizzaDetails) {

        return pizzaRepository.save(pizzaDetails);
    }

    @Override
    public List<PizzaDetails> getAllPizza() {
        List<PizzaDetails> pizzaDetailsList = pizzaRepository.findAll();
        return pizzaDetailsList;
    }
}
