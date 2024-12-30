package com.aptner.point.designpatternexample.example4.domain.store;

import com.aptner.point.designpatternexample.example4.domain.pizza.ASimple2Pizza;
import com.aptner.point.designpatternexample.example4.domain.pizza.ASimplePizza;
import com.aptner.point.designpatternexample.example4.domain.pizza.Pizza;

import java.util.Objects;

public class APizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (Objects.equals("A", type)) {
            return new ASimplePizza();
        }

        return new ASimple2Pizza();
    }
}
