package com.uml.java;

public class PlayerVehicle {
    private String name;
    private int handling;
    private int topSpeed;
    private int strength;

    public PlayerVehicle(String name, int handling, int topSpeed, int strength) {
        this.name = name;
        this.handling = handling;
        this.topSpeed = topSpeed;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void up(){

    }

    public void down(){

    }

    public void left(){

    }

    public void right(){

    }


}
