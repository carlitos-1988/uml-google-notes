package com.poash;

public class Car {
	
	public Car(String manufacturer, int fuel, int regNum) {
		this.fuel = fuel;
		this.manufacturer = manufacturer; 
		this.registrationNum = regNum; 
		this.speed = 0;
		this.isRunning = false;
		this.manufacturer = "not set yet";
		this.registrationNum = 000;
	}
	
	private String manufacturer; 
	private int fuel; 
	private float speed; 
	private int registrationNum;
	private boolean isRunning;
	
	
	
	void switchOff() {
		this.isRunning = false;
		
	}
	
	void switchOn() {
		this.isRunning = true;
		
	}
	
	void accelerate() {
		if(!this.isRunning) {
			return;
		}
		
		this.speed++;
		this.fuel -= 0.5f;
		
	}
	
	void brake() {
		if(this.speed>0) {
			this.speed=0;
		}
		
	}
	
	public void dashboard() {
		System.out.println("speed: " + this.speed + "and fuel: "+ this.fuel);
		
	}
	
	public void fillFuel(float amount) {
		this.fuel += amount;
		
	}
	
	public int getFuel() {
		return this.fuel;
	}
	
	public float getSpeed() {
		return this.speed;
	}

}
