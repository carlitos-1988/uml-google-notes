package com.uml.java;

public class GameManager  {

    private int cash;

    public int getCash(){
        return cash;
    }

    public void addCash(int amount){
        cash += amount;
    }

    public void newGame(){

        //Choose Vehicle
        PlayerVehicle vehicle = new PlayerVehicle("Sedan", 5,70,4);
        //Create Player Object

        Player player = new Player(100, vehicle);
        player.setName("Player");

        //Prepare the scenery

        //run a loop for the game
        while(player.isAlive()){

        }

        //generate gameobjects (sideobject, traffic, etc)
        //collide with other objects
        //repeat until health reaches 0

    }

    public void endGame(){
        System.out.printf("Total cash accumulated: %d", cash);
    }




}
