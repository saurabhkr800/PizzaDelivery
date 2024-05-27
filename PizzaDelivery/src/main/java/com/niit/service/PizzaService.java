package com.niit.service;

import com.niit.model.PizzaDetails;

import java.util.List;

public interface PizzaService
{
    public PizzaDetails savePizzaDetails(PizzaDetails pizzaDetails);
    public List<PizzaDetails> getAllPizza();
}
