package com.aptner.point.designpatternexample.example3;

import com.aptner.point.designpatternexample.example3.decorate.Mocha;

public class Main {

    public static void main(String[] args) {
        DarkCoffee darkCoffee = new DarkCoffee();
        Mocha mocha = new Mocha(darkCoffee);

        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());
    }
}
