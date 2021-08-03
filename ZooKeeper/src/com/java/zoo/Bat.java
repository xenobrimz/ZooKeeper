package com.java.zoo;

public class Bat extends Mamal {
    int energyLevel = 300;

    public void fly(){
        System.out.println("WHooooooooosh. bat takes flight");
        energyLevel -= 50;
        System.out.println("[Energy Level]: " + energyLevel);
    }

    public void eatHumans(){
        System.out.println("bat sucks human blood");
        energyLevel += 25;
        System.out.println("[Energy Level]: " + energyLevel);
    }

    public void attackTown(){
        System.out.println("bat terrorises town");
        energyLevel -= 100;
        System.out.println("[Energy Level]: " + energyLevel);
    }
}
