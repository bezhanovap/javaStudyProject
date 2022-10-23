package com.avenue.java.spb.group2.lesson9.homework;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("Это у нас " + animal.getName());
        System.out.println("Ест "+ animal.getFood()+ ", живёт на " +animal.getLocation());
    }
}
