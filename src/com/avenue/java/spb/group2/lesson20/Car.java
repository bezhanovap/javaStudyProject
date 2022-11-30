package com.avenue.java.spb.group2.lesson20;

import java.util.Objects;

public class Car {
    String name;
    Integer year;
    String color;
    Engine engine;


    public Car(String name, Integer year, String color, Engine engine) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    static class Engine{
        Long horsePower;

        public Engine(Long horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

}
