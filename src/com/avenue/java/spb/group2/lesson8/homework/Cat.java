package com.avenue.java.spb.group2.lesson8.homework;

public class Cat {
    // Поля
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    private static int averageWeight = 3000;
    private static int averageAge = 36;


    //Конструкторы

    /*- Имя,
            - Имя, вес, возраст
                - Имя, возраст (вес стандартный)
                - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
            - вес, цвет, адрес (чужой домашний кот)*/

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = averageWeight;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age=averageAge;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    //Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
