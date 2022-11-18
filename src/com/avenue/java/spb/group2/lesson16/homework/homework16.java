package com.avenue.java.spb.group2.lesson16.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*1

        1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
        2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
        3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
        4. Вывести содержимое Map на экран.*/

        System.out.println("Task1.");

        Map<String, String> dictFamilyName = new HashMap<>();

        // Создадим 10 пар ключ/значение
        dictFamilyName.put("Иванов", "Иван");
        dictFamilyName.put("Петров", "Пётр");
        dictFamilyName.put("Сидоров", "Иван");
        dictFamilyName.put("Васильев", "Василий");
        dictFamilyName.put("Селиванов", "Влад");
        dictFamilyName.put("Кожемяко", "Андрей");
        dictFamilyName.put("Петров", "Сергей");
        dictFamilyName.put("Семёнов", "Александр");
        dictFamilyName.put("Владимиров", "Владимир");
        dictFamilyName.put("Иванов", "Иван");
        dictFamilyName.put("Иванов", "Василий");

        // Распечатаем полученный словарь
        /*for (Map.Entry<String, String> entry:
                dictFamilyName.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

        // Воспользуемся лямбда-выражениями для печати
        dictFamilyName.forEach((s, s2) -> System.out.println(s + " : " + s2));

        // stream
        //dictFamilyName.entrySet().stream();

        System.out.println("\n--------------------------------------------------------------------\n");

        /*2

        Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
                Используй коллекции.*/

        System.out.println("Task2.");

        Map<String, Integer> months = new HashMap<>();

        // Создадим 10 пар ключ/значение
        months.put("январь", 1);
        months.put("февраль", 2);
        months.put("март", 3);
        months.put("апрель", 4);
        months.put("май", 5);
        months.put("июнь", 6);
        months.put("июль", 7);
        months.put("август", 8);
        months.put("сентябрь", 9);
        months.put("октябрь", 10);
        months.put("ноябрь", 11);
        months.put("декабрь", 12);

        // Получим название месяца, для поиска значения по ключу
        System.out.println("Введите название месяца:");
        String month = scanner.nextLine();

        /*if (months.containsKey(month.toLowerCase())) {
            System.out.println(month + " - это " + months.get(month.toLowerCase())+ " месяц");
        } else {
            System.out.println("Некорректный ввод");
        }*/

        // Вместо простого условия можно использовать тернарный оператор
        System.out.println(months.containsKey(month.toLowerCase()) ? (month + " - это " + months.get(month.toLowerCase())+ " месяц") : "Некорректный ввод");


        // stream

       // months.entrySet().stream().filter( -> s.equals(month)).forEach(System.out::println);


        System.out.println("\n--------------------------------------------------------------------\n");


        /*3

        Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
        Новая задача: Программа должна работать не с номерами домов, а с городами:

        Пример ввода:
        Москва
                Ивановы
        Киев
                Петровы
        Лондон
                Абрамовичи

        Лондон

        Пример вывода:
        Абрамовичи*/

        System.out.println("Task3.");

        Map<String, String> families = new HashMap<>();

        // Создадим словарь
        families.put("москва", "Ивановы");
        families.put("киев", "Петровы");
        families.put("лондон", "Абрамовичи");

        // Получим название города, для поиска семьи
        System.out.println("Введите название города:");
        String city = scanner.nextLine();

        /*if (families.containsKey(city.toLowerCase())) {
            System.out.println("В городе " + city + " - живут " + families.get(city.toLowerCase()));
        } else {
            System.out.println("Данных по городу " + city + " нет в словаре");
        }*/

        // Используем тернарный оператор
        System.out.println(families.containsKey(city.toLowerCase()) ? ("В городе " + city + " - живут " + families.get(city.toLowerCase())) : ("Данных по городу " + city + " нет в словаре"));

        System.out.println("\n--------------------------------------------------------------------\n");


        /*4

        Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
        арбуз - ягода,
                банан - трава,
                вишня - ягода,
                груша - фрукт,
                дыня - овощ,
                ежевика - куст,
                жень-шень - корень,
                земляника - ягода,
                ирис - цветок,
                картофель - клубень.
                        Вывести содержимое коллекции на экран, каждый элемент с новой строки.

        Пример вывода (тут показана только одна строка):
        картофель - клубень*/

        System.out.println("Task4.");

        Map<String, String> plants = new HashMap<>();

        // Создадим словарь
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");


        // Распечатаем весь словарь
        /*for (Map.Entry<String, String> entry:
                plants.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/

        plants.forEach((s, s2) -> System.out.println(s+" - "+s2));


        System.out.println("\n--------------------------------------------------------------------\n");


        /*5

        Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
                Вывести содержимое коллекции на экран, каждый элемент с новой строки.

        Пример вывода (тут показана только одна строка):
        Sim - 5


        public static void main(String[] args) {
            Map<String, Object> map = new HashMap<>();
            map.put("Sim", 5);
            map.put("Tom", 5.5);
            map.put("Arbus", false);
            map.put("Baby", null);
            map.put("Cat", "Cat");
            map.put("Eat", new Long(56));
            map.put("Food", new Character('3'));
            map.put("Gevey", '6');
            map.put("Hugs", 111111111111L);
            map.put("Comp", (double) 123);

            //напишите тут ваш код

        }*/

        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код

        /*for (Map.Entry<String, Object> entry:
                map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/

        map.forEach((s, o) -> System.out.println(s+" - "+ o));

    }
}
