package com.avenue.java.spb.group2.lesson9.homework;

public class Basket {
    // 1. Поля
    private Product[] purchasedGoods;

    // 2. Конструкторы


    public Basket(Product[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }

    // 3. Методы
    public Product[] getPurchasedGoods() {
        return purchasedGoods;
    }

    public void setPurchasedGoods(Product[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }
}
