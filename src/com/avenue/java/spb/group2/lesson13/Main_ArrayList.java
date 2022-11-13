package com.avenue.java.spb.group2.lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

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
        boolean n = s.contains("Hello");

        System.out.println("Значение 11 в коллекции " + numbers.contains(11));
        System.out.println("Значение 99 в коллекции " + numbers.contains(99));

        // 9. addAll - добавление всех элементов старой коллекции в новую

        ArrayList<Integer> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(numbers);


        // 10. remove() - удалять элемент коллекции по индексу
        numbers.remove(2);
        System.out.println(numbers);

        // 11. indexOf - возвращает индекс элемента коллекции
        System.out.println("Элемент 11 находится на индексе " + numbers.indexOf(11));

        // 12. isEmpty() - возвращает булево значение, пустая коллекция или нет
        System.out.println("Коллекция numbers пустая? " + numbers.isEmpty());

        // 13. clear() - удаляет все элементы коллекции
        numbers.clear();
        System.out.println("Коллекция numbers пустая? " + numbers.isEmpty());


        People p1 = new People("p", 25);
        People p2 = new People("p", 25);
        People p3 = new People("p", 25);
        People p4 = new People("p", 25);
        People p5 = new People("p", 25);
        People p6 = new People("p", 25);

        ArrayList<People> people = new ArrayList<>();
/*        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);*/

        for (People p :
                people) {
            System.out.println(p.getName());
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);
        linkedList.add(55);
        Integer integer1 = linkedList.peekFirst();
        Integer integer2 = linkedList.peekLast();
        Integer peek = linkedList.peek();

        linkedList.removeFirst();
        linkedList.removeLast();

        for (Integer i :
                linkedList) {
            System.out.println("\n" + i + " ");
        }

        linkedList.set(1, 77);


        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(peek);

        HashSet<Integer> integers=new HashSet<>();
        integers.add(11);
        integers.add(22);
        integers.add(22);
        integers.add(44);
        integers.add(55);

        HashSet<String> strings=new HashSet<>();
        strings.add("AA");
        strings.add("BB");
        strings.add("BB");
        strings.add("CC");


        LinkedHashSet<Integer> integers1=new LinkedHashSet<>();
        integers1.add(11);
        integers1.add(22);
        integers1.add(22);
        integers1.add(44);
        integers1.add(55);

        LinkedHashSet<String> strings1=new LinkedHashSet<>();
        strings1.add("AA");
        strings1.add("BB");
        strings1.add("BB");
        strings1.add("CC");


        System.out.println("Программа продолжилась");

    }
}
