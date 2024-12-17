package com.aptner.point.designpatternexample.example1.domain.behavior.quack;

public class Quack  implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("소리가 나는 오리");
    }
}
