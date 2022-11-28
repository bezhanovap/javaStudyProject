package com.avenue.java.spb.group2.lesson18.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task4 {
    /*4
    Есть класс кот - Cat, с полем "имя" (String).
    Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
    Получить из Map множество(Set) всех котов и вывести его на экран.*/

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            cats.put(("cat"+ i), new Cat("кот "+ i + "-й"));
        }
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        HashSet<Cat> catSet=new HashSet<>();

        for (String key :
                map.keySet()) {
            catSet.add(new Cat(key));
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

}
