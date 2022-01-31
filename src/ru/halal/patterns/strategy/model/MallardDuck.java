package ru.halal.patterns.strategy.model;

import ru.halal.patterns.strategy.FlyWithWings;
import ru.halal.patterns.strategy.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
