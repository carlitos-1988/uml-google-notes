package com.poash;

public class GameObject {

	public String name;
	
	GameObject(String name ) {
		this.name = name;
	}
	
	GameObject(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	public void onCollicion(GameObject other) {
		System.out.println("Collided with Game Object");
	}
}
