package com.avenue.java.spb.group2.lesson16.fridge;

public class Main {
    public static void main(String[] args) {
        SmartFridge fridge=new SmartFridge();
        fridge.putProducts("Apple", 5);
        fridge.putProducts("Eggs", 10);
        fridge.putProducts("Milk", 1);
        fridge.putProducts("Carrot", 10);
        fridge.putProducts("Coca-cola", 3);

        System.out.println();
        fridge.putProducts("Coca-cola", 1);

        fridge.getProduct("Pear",1);
        fridge.getProduct("Milk",1);
        fridge.getProduct("Eggs",11);
        fridge.getProduct("Coca-cola",3);


        System.out.println();
    }
}
