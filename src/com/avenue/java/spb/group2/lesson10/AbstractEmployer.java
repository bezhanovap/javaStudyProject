package com.avenue.java.spb.group2.lesson10;

public abstract class AbstractEmployer implements Employer{
    String name;
    int age;

    @Override
    public String getFullName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }
}
