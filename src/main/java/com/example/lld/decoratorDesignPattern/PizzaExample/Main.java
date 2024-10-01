package com.example.lld.decoratorDesignPattern.PizzaExample;

import com.example.lld.decoratorDesignPattern.PizzaExample.BaseClasses.BasePizza;
import com.example.lld.decoratorDesignPattern.PizzaExample.BaseClasses.FarmeHousePizza;
import com.example.lld.decoratorDesignPattern.PizzaExample.DecoratorClasses.ExtraCheese;
import com.example.lld.decoratorDesignPattern.PizzaExample.DecoratorClasses.Jalapeno;
import com.example.lld.decoratorDesignPattern.PizzaExample.DecoratorClasses.Peparoni;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        BasePizza myPizza = new Peparoni(new Jalapeno(new ExtraCheese(new FarmeHousePizza())));
        System.out.println("Your final price for your pizza is: " + myPizza.cost());

        BasePizza myPizza2 = new Peparoni(new ExtraCheese(new FarmeHousePizza()));
        System.out.println("Your final prie for your pizza is: " + myPizza2.cost());
    }
}
