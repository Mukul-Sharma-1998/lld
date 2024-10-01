package com.example.lld.decoratorDesignPattern.PizzaExample.DecoratorClasses;

import com.example.lld.decoratorDesignPattern.PizzaExample.BaseClasses.BasePizza;

public class Jalapeno extends ToppingPizzaDecorator{

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
