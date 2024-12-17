package com.aptner.point.designpatternexample.example1.domain;

import com.aptner.point.designpatternexample.example1.domain.behavior.quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;

    public Duck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
