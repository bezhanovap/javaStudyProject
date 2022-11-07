package com.avenue.java.spb.group2.lesson13;

public class Main {
    public static void main(String[] args) {
        int count = 10;
        long startPoint = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println("Hello World");
        }

        long endPoint = System.currentTimeMillis();
        long resultTime = endPoint - startPoint;
        System.out.println("Печать " + count + "кол-ва раз заняла у нас " + resultTime);


        People son = new People("Вася", 12);

        /*if (son.getAge() < 16) {
            System.out.println("Нет, на фильм нельзя");
        } else {
            System.out.println("Проходи в кино");
        }*/

        // Вместо простого условия можно использовать тернарный оператор
        String res=son.getAge() < 16 ? "Нет, на фильм нельзя" : "Проходи в кино";
        System.out.println(res);

    }
}
