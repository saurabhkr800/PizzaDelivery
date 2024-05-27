package com.niit.controller;

import com.niit.model.PizzaDetails;
import com.niit.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v2/pizza/")
@CrossOrigin
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    private ResponseEntity responseEntity;

    @PostMapping("save")
    public ResponseEntity<?> savePizza(@RequestBody PizzaDetails pizzaDetails)
    {
        try{
            responseEntity=new ResponseEntity<>(pizzaService.savePizzaDetails(pizzaDetails), HttpStatus.OK);
        }
        catch(Exception e){
            responseEntity=new ResponseEntity<>("Try again later",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("getPizza")
    public ResponseEntity<?> getPizza()
    {
        try{
            responseEntity=new ResponseEntity<>(pizzaService.getAllPizza(), HttpStatus.OK);
        }
        catch(Exception e){
            responseEntity=new ResponseEntity<>("Try again later",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
}
