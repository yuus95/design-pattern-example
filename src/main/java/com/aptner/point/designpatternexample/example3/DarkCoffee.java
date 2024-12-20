package com.aptner.point.designpatternexample.example3;

public class DarkCoffee extends Beverage {


    @Override
    public String getDescription() {
        return "다크 커피입니다.";
    }

    @Override
    public int cost() {
        return 30;
    }
}
