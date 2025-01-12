package com.niit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor@AllArgsConstructor
public class PizzaDetails {

    @Id
    private String pizzaName;
    private String pizzaType;
    private String pizzaPrice;


}
