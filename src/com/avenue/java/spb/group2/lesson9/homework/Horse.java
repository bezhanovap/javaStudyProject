package com.avenue.java.spb.group2.lesson9.homework;

public class Horse extends Animal {
    // 1. Поля
    private String name;
    private String food;
    private String location;
    private boolean saddle; // Наличие седла

    // 2. Конструкторы


    public Horse(String name, String food, String location, boolean saddle) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.saddle = saddle;
    }

    // 3. Методы
    @Override
    void makeNoise() {
        System.out.println("иго-го");
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

    public boolean isSaddle() {
        return saddle;
    }

    public void setSaddle(boolean saddle) {
        this.saddle = saddle;
    }
}
