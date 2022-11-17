package com.avenue.java.spb.group2.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationHashMap {
    public static void main(String[] args) {
        // ArrayList<String> list=new ArrayList<>();
        // List<String> strings=new ArrayList<>();
        // Map<String, Integer> map=new HashMap<>();

        System.out.println("1. Создание мапы");
        HashMap<String, Integer> map=new HashMap<>();

        System.out.println("2. Добавление элементов");
        map.put("Dinamo",5);
        map.put("Shakhter",3);
        map.put("Spartak",10);
        map.put("Dinamo",7);

        System.out.println("3. containsKey - вернет, содержится ли какое-то значение по ключу");
        System.out.println(map.containsKey("Dinamo"));
        System.out.println(map.containsKey("Zenit"));

        System.out.println("4. entrySet - возвращает пару ключ-значение, getKey(), getValue()");
        for (Map.Entry<String, Integer> entry:
             map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("5. Возвращение всех ключей");
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }

        System.out.println("6. Возвращение всех значений");
        for (String key :
                map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map.get("Dinamo"));

        System.out.println();


    }
}
