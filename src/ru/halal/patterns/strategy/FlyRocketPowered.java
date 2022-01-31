package ru.halal.patterns.strategy;

import ru.halal.patterns.strategy.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly like rocket!");
    }
}
