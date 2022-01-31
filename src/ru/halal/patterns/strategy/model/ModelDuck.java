package ru.halal.patterns.strategy.model;

import ru.halal.patterns.strategy.FlyNoWay;
import ru.halal.patterns.strategy.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
