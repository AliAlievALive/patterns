package ru.halal.patterns.strategy;

import ru.halal.patterns.strategy.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
