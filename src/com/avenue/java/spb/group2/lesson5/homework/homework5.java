package com.avenue.java.spb.group2.lesson5.homework;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*1

        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

        System.out.println("Task1");
        // Создали массив строк из 10 элементов
        String[] stringArray = new String[10];
        // заполним массив
        System.out.println("Введите 8 строк");
        for (int i = 0; i < 8; i++) {
            stringArray[i] = scanner.nextLine();
        }

        // Выведем значения массива в обратном порядке
        for (int i = stringArray.length -1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
        System.out.println("\n--------------------------------------------------------------------\n");

        /*2

        1.1. Создай массив на 10 чисел
        1.2. Считай с консоли 10 чисел и заполни ими массив
        2. Найти максимальное число из элементов массива*/

        System.out.println("Task2");
        // Создадим массив из 10 элементов
        int[] numArray = new int[10];
        System.out.println("Введите 10 целых чисел");
        //Заполним массив
        for (int i = 0; i < numArray.length; i++) {
            numArray[i]= scanner.nextInt();
        }
        //Мспользуем промежуточную переменную, которой присвоим по умолчанию значение первого элемента
        int maxValue = numArray[0];
        // Далее сравним каждый элемент с промежуточной переменной
        for (int value:
             numArray) {
            if (value>maxValue){
                maxValue=value;
            }
        }
        System.out.println("Максимальное число "+ maxValue);
        System.out.println("\n--------------------------------------------------------------------\n");


        /*3

        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк,
                индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.*/

        System.out.println("Task3");
        // Создадим массивы с 10 элементами
        String[]  textArray = new String[10];
        int[] countOfArrayElements = new int[10];

        //Заполним массив строками
        System.out.println("Введите 10 строк");
        for (int i = 0; i < textArray.length; i++) {
            textArray[i]= scanner.nextLine();
        }

        // Заполним массив с длиной строк
        for (int i = 0; i < countOfArrayElements.length; i++) {
            countOfArrayElements[i]=textArray[i].length();
            System.out.println("Длина "+ i + " строки равна " +  countOfArrayElements[i]);
        }

        System.out.println("\n--------------------------------------------------------------------\n");

        /*4

        1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 чисел и записать их в массив.
        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/

        System.out.println("Task4");
        // Создадим массивы с 10 элементами
        int[] numericArray = new int[10];

        //Заполним массив
        System.out.println("Введите 10 чисел");
        for (int i = 0; i < numericArray.length; i++) {
            numericArray[i]= scanner.nextInt();
        }

        // Распечатаем в обратном порядке
        System.out.println("Обратный порядок введённых данных выглядит так: ");
        for (int i = numericArray.length-1; i >=0; i--) {
            System.out.println(numericArray[i]);
        }

        System.out.println("\n--------------------------------------------------------------------\n");

        /*5

        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/

        System.out.println("Task5");
        // Создадим массив с 20 элементами
        int[] bigNumericArray = new int[20];

        // Создадим массивы с 10 элементами
        int[] smallNumericArray1 = new int[10];
        int[] smallNumericArray2 = new int[10];

        //Заполним массив из 20 элементов
        System.out.println("Введите 20 чисел");
        for (int i = 0; i < bigNumericArray.length; i++) {
            bigNumericArray[i]= scanner.nextInt();
        }

        // Посчитаем количество элементов половины массива
        int halfOfBigArray = bigNumericArray.length/2;

        // Разделим большой массив на два маленьких
        for (int i = 0; i < bigNumericArray.length; i++) {
            if (i < halfOfBigArray){
                smallNumericArray1[i]=bigNumericArray[i];
            } else{
                smallNumericArray2[i-halfOfBigArray]=bigNumericArray[i];
            }
        }

        //Распечатаем элементы второго маленького массива
        System.out.println("Второй маленький массив включает следующие элементы:");
        for (int value :
                smallNumericArray2) {
            System.out.println(value);
        }

        System.out.println("\n--------------------------------------------------------------------\n");

        /*6

        Создать массив на 20 чисел.
                Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
                Вывести на экран максимальное и минимальное числа через пробел.*/


        System.out.println("Task6");
        // Создадим массив с 20 элементами
        int[] numArray2 = new int[20];

        //Заполним массив из 20 элементов
        System.out.println("Введите 20 чисел");
        for (int i = 0; i < numArray2.length; i++) {
            numArray2[i]= scanner.nextInt();
        }

        // Объявим переменные для определения минимального и максимального значения
        // По умолчанию присвоим им значение первого элемента массива
        int minValue2 = numArray2[0];
        int maxValue2 = numArray2[0];

        for (int value :
                numArray2) {
            if (value<minValue2) {
                minValue2=value;
            } else if (value>maxValue2) {
                maxValue2=value;
            }

        }

        System.out.println("Максимальное число из введённых " + maxValue2 + " , а минимальное "+minValue2);
        System.out.println("\n--------------------------------------------------------------------\n");

        /*7

        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.*/


        System.out.println("Task6");
        // Создадим массив с 20 элементами
        int[] sortNumArray = new int[20];

        //Заполним массив из 20 элементов
        System.out.println("Введите 20 чисел");
        for (int i = 0; i < sortNumArray.length; i++) {
            sortNumArray[i]= scanner.nextInt();
        }

        // Объявим временную переменную, в которую будем заносить значение
        int tempValue;
        int count=0;
        // Сравним каждый элемент со следующим "Глупая сортирока"
       /* for (int i = 0; i < sortNumArray.length-1; i++) {
            count++;
            if (sortNumArray[i]<sortNumArray[i+1]){
                //Меняем элементы местами
                tempValue=sortNumArray[i];
                sortNumArray[i]=sortNumArray[i+1];
                sortNumArray[i+1]=tempValue;
                //Сбрасываем счётчик, чтобы цикл снова начал с 0 индекса
                i=-1;
            }
        }*/

        //Сортировка пузырьком
        for (int i = 0; i < sortNumArray.length-1; i++) {
            for (int j = 0; j < sortNumArray.length-1; j++) {
                count++;
                if (sortNumArray[j]<sortNumArray[j+1]){
                    //Меняем элементы местами
                    tempValue=sortNumArray[j];
                    sortNumArray[j]=sortNumArray[j+1];
                    sortNumArray[j+1]=tempValue;
                }
            }
        }

        System.out.println("Отсортированный по убыванию массив");
        for (int i = 0; i < sortNumArray.length; i++) {
            System.out.println(sortNumArray[i]);
        }

        System.out.println("Количество итераций"+count);

        System.out.println("\n--------------------------------------------------------------------\n");
    }
}
