package com.uml.java;

public class FireHydrant extends SideObject {

    public FireHydrant(int damage, int cash) {
        super(damage, cash);
    }

    @Override
    public void OnCollision(GameObject other) {
        super.OnCollision(other);
    }
}
