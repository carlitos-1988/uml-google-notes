package com.poash;

public class Program {
	
	private static Player player = new Player();
	
	public static void main(String[] args) {

	FireHydrant fh = new FireHydrant();
	
	
	fh.setName("FireHydrant");
	fh.setDamage(100);
	
	GameObject go = fh;
	
	go.setName("Second hydrant");
	
	System.out.println(fh.getName());
	
	doCollicion(fh);
	
	}
	
	private static void doCollicion( GameObject go) {
		go.onCollicion(player);
	}
	
}
