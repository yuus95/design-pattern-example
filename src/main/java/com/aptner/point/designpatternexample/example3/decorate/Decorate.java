package com.aptner.point.designpatternexample.example3.decorate;

import com.aptner.point.designpatternexample.example3.Beverage;

public abstract class Decorate extends Beverage {
    protected Beverage beverage;

    public Decorate(Beverage beverage) {
        this.beverage = beverage;
    }
}
