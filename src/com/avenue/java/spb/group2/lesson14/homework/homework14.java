package com.avenue.java.spb.group2.lesson14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class homework14 {
    public static void main(String[] args) {
    /*1
        Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.*/

        System.out.println("Task1.");

        ArrayList<String> arrayList1 = new ArrayList<>();

        // Заполним список
        fillStringList(arrayList1, 5);

        // Удалим 3-ий элемент
        arrayList1.remove(2);

        // Распечатаем
        printArrayElements(arrayList1);

        System.out.println("\n--------------------------------------------------------------------\n");

    /*2
        1. Создай список из слов "мама", "мыла", "раму".
        2. После каждого слова вставь в список строку, содержащую слово "именно".
        3. Вывести результат на экран, каждый элемент списка с новой строки.*/

        System.out.println("Task2.");

        ArrayList<String> arrayList2 = new ArrayList<>();

        // Заполним список
        fillStringList(arrayList2, 3);

        // После каждого элемента вставим новый с фразой "именно"
        for (int i = arrayList2.size(); i>0 ; i--) {
            arrayList2.add(i, "именно");
        }

        // Распечатаем
        printArrayElements(arrayList2);
        System.out.println("\n--------------------------------------------------------------------\n");


    /*3
        1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
            2.1. удалять из списка строк все слова, содержащие букву "р"
            2.2. удваивать все слова содержащие букву "л".
            2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
            2.4. с другими словами ничего не делать.


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        return null;
    }*/

        System.out.println("Task3.");

        ArrayList<String> strings = new ArrayList<String>();

        // Добавим элементы в список
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        // Заполним список
        // fillStringList(strings, 0);

        // Вызовем метод fix, преобразующий список
        strings = fix(strings);


        // Распечатаем
        printArrayElements(strings);
        System.out.println("\n--------------------------------------------------------------------\n");


    /*4
        1. Введи с клавиатуры 10 слов в список строк.
        2. Метод doubleValues должен удваивать слова по принципу:
        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
        3. Выведи результат на экран, каждое значение с новой строки.*/

        System.out.println("Task4.");

        ArrayList<String> arrayList4 = new ArrayList<>();

        // Заполним список
        fillStringList(arrayList4, 10);

        // Вызовем метод удваивания
        doubleValues(arrayList4);

        // Распечатаем
        printArrayElements(arrayList4);
        System.out.println("\n--------------------------------------------------------------------\n");

    /*5
        1. Введи с клавиатуры 10 слов в список строк.
        2. Определить, является ли список упорядоченным по возрастанию длины строки.
        3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.*/

        System.out.println("Task5.");

        ArrayList<String> arrayList5 = new ArrayList<>();

        // Заполним список
        fillStringList(arrayList5, 4);

        // найдём индекс элемента
        for (int i = 1; i <arrayList5.size(); i++) {
            if (arrayList5.get(i).length() < arrayList5.get(i - 1).length()) {
                System.out.println("Элемент, нарушающий последовательность, соответствует индексу " + (i-1) + ", т.е. это "+i+"-й введенный элемент");
            }
        }

        System.out.println("\n--------------------------------------------------------------------\n");

    }


    // Заполним массив элементами строк ввода из консоли
    public static void fillStringList(ArrayList<String> arrayList, int countElements) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        // для ввода неограниченного числа элементов при вызове подаётся значение 0
        if (countElements == 0) {
            int count = 0;
            System.out.println("Для завершения ввода введите ToSTOP");
            while (!input.trim().equalsIgnoreCase("ToStop")) {
                count++;
                System.out.println("Введите " + count + "-й элемент");
                input = scanner.nextLine();
                arrayList.add(input);
            }
            // Удалим последний элемент - это служебное слово для завершения ввода, оно нам не нужно
            arrayList.remove((count - 1));
        } else {
            // Переменная, в которую будем сохранять ввод из консоли
            for (int i = 0; i < countElements; i++) {
                System.out.println("Введите " + (i + 1) + "-й элемент");
                input = scanner.nextLine();

                // Пока строка пустая, будем запрашивать ввод. Символ пробела тоже будем считать пустотой.
                while (input.trim().isEmpty()) {
                    System.out.println("Введите " + (i + 1) + "-й элемент");
                    input = scanner.nextLine();
                }
                arrayList.add(input);
            }
        }
    }

    // Распечатаем элементы массива, каждый элемент на новой строчке
    public static void printArrayElements(ArrayList<String> arrayToPrint) {
        System.out.println("Элементы списка:");
        for (String elem :
                arrayToPrint) {
            System.out.println(elem);
        }
    }

    // Удаляем элементы с р, удваиваем с л, а если есть р и л, то пропускаем, как и остальные
    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = strings.size() - 1; i >= 0; i--) {
            if (strings.get(i).toLowerCase().contains("р") & strings.get(i).toLowerCase().contains("л")) {
            } else if (strings.get(i).toLowerCase().contains("р")) {
                strings.remove(i);
            } else if (strings.get(i).toLowerCase().contains("л")) {
                strings.add(i, strings.get(i));
            }
        }
        //напишите тут ваш код
        return strings;
    }

    // Просто продублируем каждый элемент
    private static void doubleValues(ArrayList<String> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.add(i, arrayList.get(i));
        }
    }


}
