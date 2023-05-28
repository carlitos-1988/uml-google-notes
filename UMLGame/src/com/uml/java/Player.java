package com.uml.java;

public class Player extends GameObject {
    private int health;
    // Newish to me being able to store another object makes sense do
    private PlayerVehicle vehicle;

    public Player(int health, PlayerVehicle vehicle) {
        this.health = health;
        this.vehicle = vehicle;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void applyDamage(int damage, int cash){
        health -= damage - vehicle.getStrength();
    }

    public void accelerate(){
        vehicle.up();
    }

    public void brake(){
        vehicle.down();
    }

    public void steerRight(){
        vehicle.right();
    }

    public void steerLeft(){
        vehicle.left();
    }


}
