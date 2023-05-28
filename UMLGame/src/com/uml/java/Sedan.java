package com.uml.java;

public class Sedan extends TrafficCar {

    public Sedan(int cash, int damage){
        super(damage, cash);
    }

    @Override
    public void OnCollision(GameObject other) {
        super.OnCollision(other);
    }
}
