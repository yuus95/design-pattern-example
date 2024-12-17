package com.aptner.point.designpatternexample.example1;

import com.aptner.point.designpatternexample.example1.domain.behavior.quack.Quack;

public class DuckSimulation {

    /**
     *
     */
    public static void main(String[] args) {
        SimpleDuck simpleDuck = new SimpleDuck(new Quack());
        simpleDuck.performQuack();
    }
}
