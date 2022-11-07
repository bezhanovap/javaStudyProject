package com.avenue.java.spb.group2.lesson13;

import java.util.ArrayList;

public class Main_ArrayList {
    public static void main(String[] args) {
        /**
         * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
         * Изменяет размер динамически, но может включать в себя элементы только одного типа.
         * Примитивные типы нельзя хранить внутри коллекций.
         Для этого есть ссылочные типы примитивов:
         int Integer
         byte Byte
         short Short
         char Character
         * */

        // 1. Создание коллекции
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        System.out.println("Элементы нашей коллекции: " + numbers);

        // 2. Добавление в коллекцию с указанием индекса
        numbers.add(2, 55);
        System.out.println("Элементы нашей коллекции: " + numbers);

        // 3. Обработка исключений
        /*try {
            numbers.add(10,66);
        }catch (Exception exception){
            exception.printStackTrace();
        }

        try {
            numbers.add(15,77);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        System.out.println("Программа продолжилась");

        // 4. Метод size() - возвращает размер коллекции
        System.out.println("Размер коллекции - " + numbers.size());

        // 5. Set() Устанваливает объект на определённый индекс, удаляя предыдущий объект из коллекции
        System.out.println("Заменим 2-ой элемент колеекции на 88");
        numbers.set(2, 88);

        // 6. get() Получение элемента коллекции
        Integer b = numbers.get(0);
        System.out.println(b);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println();

        for (Integer c :
                numbers) {
            System.out.println(c);
        }

        // 7. toArray() Возвращение коллекции в виде массива

        System.out.println("Возвращение коллекции в виде массива");
        Object[] array = numbers.toArray();
        for (Object o :
                array) {
            System.out.println(o);
        }


        // 8. Метод contains() -проверка наличия этого элемента в коллекции
        String s = "Hello world";
        boolean n=s.contains("Hello");

        System.out.println("Значение 11 в коллекции " +  numbers.contains(11));
        System.out.println("Значение 99 в коллекции " +  numbers.contains(99));

        // 9. addAll - добавление всех элементов старой коллекции в новую

        ArrayList<Integer> copyArrayList=new ArrayList<>();
        copyArrayList.addAll(numbers);


        // 10. remove() - удалять элемент коллекции по индексу
        numbers.remove(2);
        System.out.println(numbers);

        // 11. indexOf - возвращает индекс элемента коллекции
        System.out.println("Элемент 11 находится на индексе " + numbers.indexOf(11));

        // 12. isEmpty() - возвращает булево значение, пустая коллекция или нет
        System.out.println("Коллекция numbers пустая? "+numbers.isEmpty());

        // 13. clear() - удаляет все элементы коллекции
        numbers.clear();
        System.out.println("Коллекция numbers пустая? "+numbers.isEmpty());


    }
}
