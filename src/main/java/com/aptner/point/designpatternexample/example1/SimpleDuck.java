package com.aptner.point.designpatternexample.example1;

import com.aptner.point.designpatternexample.example1.domain.Duck;
import com.aptner.point.designpatternexample.example1.domain.behavior.quack.QuackBehavior;

public class SimpleDuck extends Duck {

    public SimpleDuck(QuackBehavior quackBehavior) {
        super(quackBehavior);
    }
}
