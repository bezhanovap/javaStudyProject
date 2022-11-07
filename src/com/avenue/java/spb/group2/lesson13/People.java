package com.avenue.java.spb.group2.lesson13;

public class People {

    // Поля
    private String name;
    private int age;

    // Конструкторы

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
