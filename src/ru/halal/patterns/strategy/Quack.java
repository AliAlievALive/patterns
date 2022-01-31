package ru.halal.patterns.strategy;

import ru.halal.patterns.strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
