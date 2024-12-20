package com.aptner.point.designpatternexample.example3.decorate;

import com.aptner.point.designpatternexample.example3.Beverage;

public class Mocha extends Decorate {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "모카 " + beverage.getDescription();
    }

    @Override
    public int cost() {
        return beverage.cost() + 15;
    }
}
