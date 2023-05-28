package com.uml.java;

public class SideObject extends GameObject {

    public SideObject(int damage, int cash) {
        this.damage = damage;
        this.cash = cash;
    }

    private int damage;
    private int cash;
    private int count = 0;

    final public int getDamage() {
        return damage;
    }

    final public void setDamage(int damage) {
        this.damage = damage;
    }

    final public int getCash() {
        return cash;
    }

    final public void setCash(int cash) {
        this.cash = cash;
    }
}
