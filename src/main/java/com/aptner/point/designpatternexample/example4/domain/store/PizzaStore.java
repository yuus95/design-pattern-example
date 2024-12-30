package com.aptner.point.designpatternexample.example4.domain.store;

import com.aptner.point.designpatternexample.example4.domain.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.cutting();
        pizza.order();
    }

    abstract Pizza createPizza(String type);
}
