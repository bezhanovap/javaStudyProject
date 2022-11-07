package com.avenue.java.spb.group2.lesson13.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {

        /*1

        1. Создай список строк.
        2. Добавь в него 5 различных строк.
        3. Выведи его размер на экран.
        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.*/

        System.out.println("Task1.");

        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Первая");
        firstList.add("Вторая");
        firstList.add("Третья");
        firstList.add("Четвёртая");
        firstList.add("Пятая");

        System.out.println("Количество элементов в списке - " + firstList.size());

        // Метод распечатает весь массив, каждый элемент на новой строчке
        printArrayElements(firstList);

        System.out.println("\n--------------------------------------------------------------------\n");




        /*2
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую длинную строку в списке.
        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.*/

        System.out.println("Task2.");

/*
элементы строк для проверки

первый элемент
второй элемент
третий элемент
четвёртый элемент
пятый элемент
*/

        ArrayList<String> secondList = new ArrayList<>();

        // Заполним список
        System.out.println("Заполним новый список");
        fillStringList(secondList, 5, true);

        // Найдём размер самой длинной строки
        int longestStringSize = 0;
        for (int i = 0; i < secondList.size(); i++) {
            if (secondList.get(i).length() > longestStringSize) {
                longestStringSize = secondList.get(i).length();
            }
        }

        // Найдём элементы списка, с таким размером и добавим их в новый массив
        ArrayList<String> longestStrings = new ArrayList<>();
        for (int i = 0; i < secondList.size(); i++) {
            if (secondList.get(i).length() == longestStringSize) {
                longestStrings.add(secondList.get(i));
            }
        }

        System.out.println();
        System.out.println("Самые длинные строки, нашлось " + longestStrings.size() + " шт.");
        // Распечатаем найденные строки
        printArrayElements(longestStrings);


        System.out.println("\n--------------------------------------------------------------------\n");


        /*3
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.*/

        System.out.println("Task3.");

        ArrayList<String> thirdList = new ArrayList<>();

        // Заполним список
        System.out.println("Заполним новый список");
        fillStringList(thirdList, 5, true);

        // Найдём размер самой короткой строки, по умолчанию это будет первый элемент
        int shortestStringSize = thirdList.get(0).length();
        for (int i = 0; i < thirdList.size(); i++) {
            if (thirdList.get(i).length() < shortestStringSize) {
                shortestStringSize = thirdList.get(i).length();
            }
        }

        // Найдём элементы списка, с таким размером и добавим их в новый массив
        ArrayList<String> shortestStrings = new ArrayList<>();
        for (int i = 0; i < thirdList.size(); i++) {
            if (thirdList.get(i).length() == shortestStringSize) {
                shortestStrings.add(thirdList.get(i));
            }
        }

        System.out.println();
        System.out.println("Самые короткие строки, нашлось " + shortestStrings.size() + " шт.");
        // Распечатаем найденные строки
        printArrayElements(shortestStrings);

        System.out.println("\n--------------------------------------------------------------------\n");


        /*4

        1. Создай список строк в методе main.
        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.*/

        System.out.println("Task4.");

        ArrayList<String> fourthList = new ArrayList<>();

        // Заполним список
        System.out.println("Заполним новый список");
        fillStringList(fourthList, 10, false);

        System.out.println();
        // Распечатаем получившийся список
        printArrayElements(fourthList);

        System.out.println("\n--------------------------------------------------------------------\n");


        /*5
        1. Создай список строк.
        2. Добавь в него 5 строк с клавиатуры.
        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.*/

        System.out.println("Task5.");

        ArrayList<String> fifthList = new ArrayList<>();

        // Заполним список
        System.out.println("Заполним новый список");
        fillStringList(fifthList, 5, true);

        // Переместим последний элемент в начало 13 раз
        for (int i = 0; i < 13; i++) {
            moveLastToFirst(fifthList);
        }

        System.out.println();
        // Распечатаем получившийся список
        printArrayElements(fifthList);

        System.out.println("\n--------------------------------------------------------------------\n");


        /*6
        1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
                Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/

        System.out.println("Task6.");

        ArrayList<String> sixthList = new ArrayList<>();

        // Заполним список
        System.out.println("Заполним новый список");
        fillStringList(sixthList, 10, true);

        // Переместим последний элемент в начало 13 раз

        // Найдём размер самой короткой строки, по умолчанию это будет первый элемент
        int shortestStringSize2 = thirdList.get(0).length();
        // Найдём размер самой длинной строки
        int longestStringSize2 = 0;

        for (int i = 0; i < sixthList.size(); i++) {
            if (sixthList.get(i).length() > longestStringSize2) {
                longestStringSize2 = sixthList.get(i).length();
            } else if (sixthList.get(i).length() < shortestStringSize2) {
                shortestStringSize2 = sixthList.get(i).length();
            }
        }

        // Найдём индексы самых коротких и самых джлинных строк, для этого добавим их в отдельные списки
        ArrayList<Integer> shortestIndexes=new ArrayList<>();
        ArrayList<Integer> longestIndexes=new ArrayList<>();

        for (int i = 0; i < sixthList.size(); i++) {
            if (sixthList.get(i).length() == longestStringSize2) {
                longestIndexes.add(i);
            } else if (sixthList.get(i).length() == shortestStringSize2) {
                shortestIndexes.add(i);
            }
        }

        System.out.println();
        // Распечатаем элемент, который встретился ранее, т.е. у которого индекс меньше'

        if (longestIndexes.get(0)>shortestIndexes.get(0)){
            System.out.println(sixthList.get(shortestIndexes.get(0)));
        }else{
            System.out.println(sixthList.get(longestIndexes.get(0)));
        }


        System.out.println("\n--------------------------------------------------------------------\n");


        /*7

        1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
        Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
                Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
                Порядок объявления списков очень важен.
        1.1 Создай метод printList
        2. Метод printList должен выводить на экран все элементы списка с новой строки.
        3. Используя метод printList выведи эти три списка на экран.
                Сначала тот, который для x%3, потом тот, который для x%2, потом последний.*/


        System.out.println("Task7.");

        ArrayList<Integer> seventhList = new ArrayList<>();

        // Заполним список
        System.out.println("Заполним новый список целыми числами");
        fillIntegerList(seventhList, 20);

        // Рассортируем изначальный список на три списка по условиям
        ArrayList<Integer> to3List = new ArrayList<>();
        ArrayList<Integer> to2List = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (Integer num :
                seventhList) {
            if (num%3==0 && num%2==0){
                to3List.add(num);
                to2List.add(num);
            } else if (num%3==0) {
                to3List.add(num);
            } else if (num%2==0) {
                to2List.add(num);
            }else {
                otherList.add(num);
            }
        }


        System.out.println();
        // Распечатаем получившиеся списки
        System.out.println("Элементы, которые делятся нацело на 3");
        printList(to3List);
        System.out.println("Элементы, которые делятся нацело на 2");
        printList(to2List);
        System.out.println("Остальные элементы исходного списка");
        printList(otherList);

        System.out.println("\n--------------------------------------------------------------------\n");


    }










    // Перемещение последнего элемента в начало
    private static void moveLastToFirst(ArrayList<String> arrayList) {
        // Сначала добавим последний элемент в начало
        arrayList.add(0,(arrayList.get(arrayList.size()-1)));

        // Затем удалим последний элемент
        arrayList.remove((arrayList.size()-1));
    }


    // Заполним массив элементами строк ввода из консоли
    public static void fillStringList(ArrayList<String> arrayList, int countElements, boolean isEnd) {
        Scanner scanner = new Scanner(System.in);

        // Переменная, в которую будем сохранять ввод из консоли
        for (int i = 0; i < countElements; i++) {
            String input;
            System.out.println("Введите " + (i + 1) + "-й элемент");
            input = scanner.nextLine();

            // Пока строка пустая, будем запрашивать ввод. Символ пробела тоже будем считать пустотой.
            while (input.trim().isEmpty()) {
                System.out.println("Введите " + (i + 1) + "-й элемент");
                input = scanner.nextLine();
            }

            if (isEnd) {
                // Если параметр isEnd - true, то добавляем элемент в конец списка
                arrayList.add(input);
            } else {
                // Если false, то будем добавлять элемент в самое начало списка
                arrayList.add(0, input);
            }
        }
    }

    // Заполним массив элементами строк ввода из консоли
    public static void fillIntegerList(ArrayList<Integer> arrayList, int countElements) {
        Scanner scanner = new Scanner(System.in);

        // Переменная, в которую будем сохранять ввод из консоли
        for (int i = 0; i < countElements; i++) {
            int input;
            System.out.println("Введите " + (i + 1) + "-й элемент");
            input =Integer.parseInt(scanner.nextLine());
            arrayList.add(input);

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

    // Распечатаем элементы массива чисел, каждый элемент на новой строчке
    public static void printList(ArrayList<Integer> arrayToPrint) {
        System.out.println("Элементы списка:");
        for (Integer num :
                arrayToPrint) {
            System.out.println(num);
        }
    }


}
