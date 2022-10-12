package com.avenue.java.spb.group2.lesson6.homework;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        /*1
        Задача 1.1: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
        Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

        Новая задача 1.2: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
        Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
        Программа выводит слова на экран.*/

        System.out.println("Task1.1");

        // Ограничим ввод пользователя длинной масства
        String[] textToConvert=new String[100];
        textToConvert[0]=" ";
        int index=0;
        System.out.println("Введите строки для конвертации, их количество ограничено 100 строками.");
        System.out.println("Либо нажмите Enter, для завершения ввода строк");

        while (true){
            //Если превысим количество вводимых строк, то сообщим об этом
            if (index== textToConvert.length){
                System.out.println("Вы превысили допустимое количество вводимых в конвертер строк");
                break;
            } else {
                //Принимаем строку и вносим её в массив
                System.out.println("Введите строку:");
                textToConvert[index]= scanner.nextLine();
                if (textToConvert[index].length()==0) {
                    break;
                }
            }
            // Искусственно увеличиваем индекс элемента массива
            index++;
        }

        System.out.println("Преобразованные строки выглядят так:");

        // Создадим новый массив для внесения конвертированных данных
        String[] convertedText=new String[index];
        for (int i = 0; i < convertedText.length; i++) {
            convertedText[i]=textToConvert[i].toUpperCase();
            System.out.println(convertedText[i]);
        }

        System.out.println("\n--------------------------------------------------------------------\n");



        System.out.println("Task1.2");

        // Ограничим ввод пользователя длинной масства
        String[] textToConvert2=new String[100];
        textToConvert2[0]=" ";
        int index2=0;
        System.out.println("Введите строки для конвертации, их количество ограничено 100 строками.");
        System.out.println("Либо нажмите Enter, для завершения ввода строк");

        while (true){
            //Если превысим количество вводимых строк, то сообщим об этом
            if (index2== textToConvert2.length){
                System.out.println("Вы превысили допустимое количество вводимых в конвертер строк");
                break;
            } else {
                //Принимаем строку и вносим её в массив
                System.out.println("Введите строку:");
                textToConvert2[index2]= scanner.nextLine();
                if (textToConvert2[index2].length()==0) {
                    break;
                }
            }
            // Искусственно увеличиваем индекс элемента массива
            index2++;
        }

        System.out.println("Преобразованные строки выглядят так:");

        // Создадим новый массив для внесения конвертированных данных
        String[] convertedText2=new String[index2];
        for (int i = 0; i < convertedText2.length; i++) {
            if (textToConvert2[i].length()%2==0){
                convertedText2[i]=textToConvert2[i].concat(textToConvert2[i]);
            }else{
                convertedText2[i]=textToConvert2[i].concat(textToConvert2[i]).concat(textToConvert2[i]);
            }

            System.out.println(convertedText2[i]);
        }

        System.out.println("\n--------------------------------------------------------------------\n");


        /*2
        Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.*/

        System.out.println("Task2");

        String[] textLine=new String[5];
        // Заполним массив
        System.out.println("Введите 5 строк для сравнения");
        for (int i = 0; i < textLine.length; i++) {
            textLine[i]=scanner.nextLine();
        }

        // Объявим временную переменную, в которую будем заносить значение
        String tempValue;

        // Выполним сортировку маасива строк по длине его элементов по возрастанию.
        for (int i = 0; i < textLine.length-1; i++) {
            for (int j = 0; j < textLine.length-1; j++) {
                if (textLine[j].length()>textLine[j+1].length()){
                    //Меняем элементы местами
                    tempValue=textLine[j];
                    textLine[j]=textLine[j+1];
                    textLine[j+1]=tempValue;
                }
            }
        }
        System.out.println("Самая короткая строка: " + textLine[0] + " - её длина " + textLine[0].length());
        System.out.println("Самая длинная строка: " + textLine[textLine.length-1] + " - её длина " + textLine[textLine.length-1].length());

        System.out.println("\n--------------------------------------------------------------------\n");


        /*3
        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

        System.out.println("Task3");

        String[] textArray=new String[10];
        // Заполним массив
        System.out.println("Введите 8 строк");
        //Заполнение массива ограничим 8 строками, т.е -2 от размера массива
        for (int i = 0; i < textArray.length-2; i++) {
            textArray[i]=scanner.nextLine();
        }

        //Выведем массив в обратном порядке
        System.out.println("Введённые 8 строк, в массиве из 10 элементов, в обратном порядке:");
        for (int i = textArray.length-1; i >=0 ; i--) {
            System.out.println(textArray[i]);
        }
        System.out.println("\n--------------------------------------------------------------------\n");

        /*4
        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
        которой совпадает с текущим индексом из массива чисел.*/

        System.out.println("Task4");

        String[] textArray2=new String[10];
        int[] lenghtOfTextArray=new int[10];

        // Заполним массив строк
        System.out.println("Введите 10 строк");
                for (int i = 0; i < textArray2.length; i++) {
            textArray2[i]=scanner.nextLine();
        }

        // Заполним массив чисел
        System.out.println("Длины введённых строк:");
        for (int i = 0; i < textArray2.length; i++) {
            lenghtOfTextArray[i]=textArray2[i].length();
            System.out.print(lenghtOfTextArray[i]+" ");
        }

        System.out.println("\n--------------------------------------------------------------------\n");


        /*5
        1. Считать 6 строк и заполнить ими массив strings.
        2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/

        System.out.println("Task5");

        String[] textArray3=new String[6];

        // Заполним массив строк
        System.out.println("Введите 6 строк");
        for (int i = 0; i < textArray3.length; i++) {
            textArray3[i]=scanner.nextLine();
        }

        // Сравниим каждый элемент с каждым
        //Во внешнем цикле последний элемент не будем брать,т.к. с ним будем сравнивать предыдущий
        for (int i = 0; i < textArray3.length-1; i++) {
            // Во внутреннем цикле не будем брать первый элемент, т.к. нам не зачем его сравнивать с самим собой
            //Уже пустые элементы также будем пропускать в условии
            for (int j = 1; j < textArray3.length; j++) {
                if (i!=j && textArray3[i]!=null && textArray3[i].equals(textArray3[j])){
                    //Обнулим повторяющиеся элементы
                    textArray3[j]=null;
                }
            }
        }

        System.out.println("Уникальные элементы массива строк");
        for (int i = 0; i < textArray3.length; i++) {
            System.out.println(textArray3[i]);
        }

        System.out.println("\n--------------------------------------------------------------------\n");
    }
}
