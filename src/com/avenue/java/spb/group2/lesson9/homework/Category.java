package com.avenue.java.spb.group2.lesson9.homework;

public class Category {
    // 1. Поля
    private String name;
    private Product[] productsArray;

    // 2. Конструкторы


    public Category(String name, Product[] productsArray) {
        this.name = name;
        this.productsArray = productsArray;
    }

    // 3. Методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProductsArray() {
        return productsArray;
    }

    public void setProductsArray(Product[] productsArray) {
        this.productsArray = productsArray;
    }
}
