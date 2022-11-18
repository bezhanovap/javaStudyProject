package com.avenue.java.spb.group2.lesson16.fridge;

import java.util.HashMap;

public class SmartFridge {
    // Поля
    private HashMap<String, Integer> products = new HashMap<>();

    // Конструктор

    // Методы
    public void putProducts(String product, int value) {
        // Если продукт есть уже в холодильнике
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        }
        // Если продукта нет в холодильнике
        else {
            products.put(product, value);

        }

    }

    public void getProduct(String product, int value) {
        // if this product is not present in fridge
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта у нас нет");
            return;
        }

        // if this product is enough in our fridge
        if (products.get(product) > value) {
            System.out.println("Продукта " + product + " с избытком, выдано " + value);
            products.put(product, products.get(product) - value);
            return;
        }

        // if this product is not enough in our fridge
        if (products.get(product) < value) {
            System.out.println("Продукта " + product + " недостаточно, выдал вам всё что есть " + products.get(product));
            products.remove(product);
            return;
        }

        // if this product is last and it's enough
        if (products.get(product) == value) {
            System.out.println("Продукта " + product + " достаточно");
            products.remove(product);
            return;
        }

    }

}
