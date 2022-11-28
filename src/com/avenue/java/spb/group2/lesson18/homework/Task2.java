package com.avenue.java.spb.group2.lesson18.homework;

import java.util.Arrays;
import java.util.HashMap;


/*2
        Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);*/

public class Task2 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Тип исключения "+ e.getClass() +" "+ e.getMessage());
        }

        System.out.println("Конец программы");

    }
}
