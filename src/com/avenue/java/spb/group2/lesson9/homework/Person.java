package com.avenue.java.spb.group2.lesson9.homework;

public class Person {
    // 1. Поля
    private String fullName;
    private int age;

    // 2. Конструкторы

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // 3. Методы

    public void move() {
        System.out.println("Один шажочек");
    }

    public void talk() {
        System.out.println("Говорит " + fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
