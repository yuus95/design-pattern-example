package com.aptner.point.designpatternexample.example4;

import com.aptner.point.designpatternexample.example4.domain.store.APizzaStore;
import com.aptner.point.designpatternexample.example4.domain.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new APizzaStore();
        pizzaStore.orderPizza("A");
        pizzaStore.orderPizza("Test");
    }
}
