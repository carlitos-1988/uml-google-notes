package com.poash;

public class FireHydrant extends SideObject{

	public FireHydrant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FireHydrant(int damage, String name) {
		super(damage, name);
		// TODO Auto-generated constructor stub
	}
	
	public void onCollicion(GameObject other) {
		System.out.println("collided with firehydrant");
	}
	

}
