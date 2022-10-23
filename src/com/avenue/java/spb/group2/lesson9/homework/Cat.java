package com.avenue.java.spb.group2.lesson9.homework;

public class Cat extends Animal {
    // 1. Поля
    private String name;
    private String food;
    private String location;
    private int carryingSize; // Размер переноски

    // 2. Конструкторы


    public Cat(String name, String food, String location, int carryingSize) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.carryingSize = carryingSize;
    }

    // 3. Методы
    @Override
    void makeNoise() {
        System.out.println("мяу");
    }

    @Override
    void eat() {
        System.out.println("Ест " + food);
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

    public int getCarryingSize() {
        return carryingSize;
    }

    public void setCarryingSize(int carryingSize) {
        this.carryingSize = carryingSize;
    }
}
