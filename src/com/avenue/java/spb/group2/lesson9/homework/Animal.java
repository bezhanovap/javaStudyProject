package com.avenue.java.spb.group2.lesson9.homework;

public abstract class Animal {
    // 1. Поля
    private String name;
    private String food;

    private String location;

    // 2. Конструкторы

    // 3. Методы
    abstract void makeNoise();

    abstract void eat();

    abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
