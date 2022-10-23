package com.avenue.java.spb.group2.lesson9;

public abstract class Disk {

    // 1. Поля
    private String name; // Название альбома
    private int year; //Год выпуска



    // 3. Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void printInfo();
}
