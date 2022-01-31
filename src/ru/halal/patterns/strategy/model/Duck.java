package ru.halal.patterns.strategy.model;

import ru.halal.patterns.strategy.interfaces.FlyBehavior;
import ru.halal.patterns.strategy.interfaces.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
