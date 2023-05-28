package com.poash;

public class SideObject extends GameObject{

	private int damage;
	
	SideObject(int damage, String name){
		super(name);
		this.damage = damage;
	}
	
	SideObject(){}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	};
	
	
}
