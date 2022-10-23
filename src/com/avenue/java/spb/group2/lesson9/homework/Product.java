package com.avenue.java.spb.group2.lesson9.homework;

public class Product {
    // 1. Поля
    private String name;
    private Double price;
    private Double rating;

    //2. Конструкторы

    public Product(String name, Double price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


    // 3. Методы

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
