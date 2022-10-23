package com.avenue.java.spb.group2.lesson9.homework;

public class Dog extends Animal{
    // 1. Поля
    private String name;
    private String food;
    private String location;
    private int leashLength; // Длина поводка

    // 2. Конструкторы


    public Dog(String name, String food, String location, int leashLength) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.leashLength = leashLength;
    }

    // 3. Методы
    @Override
    void makeNoise() {
        System.out.println("гав");
    }

    @Override
    void eat() {
        System.out.println("Ест "+ food);
    }

    @Override
    void sleep() {
        System.out.println(name + " спит");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public int getLeashLength() {
        return leashLength;
    }

    public void setLeashLength(int leashLength) {
        this.leashLength = leashLength;
    }
}
