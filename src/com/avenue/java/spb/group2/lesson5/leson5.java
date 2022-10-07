package com.avenue.java.spb.group2.lesson5;

import java.util.Scanner;

public class leson5 {
    public static void main(String[] args) {

        /**
         foreach удобен тем, что проходит просто по всем значениям слева на право по каждой ячейке. Индексы не нужны!
         for(Тип переменной называем саму переменную : имя массива ) {
         Выполняемый код
         }
         * */

        /**
         String и его основные методы

         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         * */

        /*Массивы
        1. Заполнение происходит данными одного типа
        */

        /*int[] arr1 = {5, 7, 10};

        int firstSlot = arr1[0];
        int secondSlot = arr1[1];
        System.out.println(firstSlot);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr2 = new int[1];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }*/

        /*System.out.println("Печать чётных элементов массива");

        int[] arr3 = {12, 3, 15, 10, 8, 5, 30, 17, 14, 11};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]%2 == 0) {
                System.out.print(arr3[i]+ " ");
            }

        }*/

        /*for (int itVar : arr3) {
            if (itVar % 2 == 0) {
                System.out.print(itVar + " ");
            }
        }*/

        /*System.out.println("3. Заполнить массив значениями от 0 до 100, кратными 5");

        int [] array = new int[101];
        // Заполним массив значениями от 0 до 100
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }

        // Создадим счётчик
        int count =0;
        // Посчитаем количество искомых элементов
        for (int i: array) {
            if (i%5==0 && i!=0){
                count++;
            }
        }

        // Создадим новый массив нужного размера и внесём в него нужные элементы
        int [] resArray = new int[count];
        //Зададим индекс для нового массива, который будем вручную увеличивать
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%5==0 && array[i]!=0 ){
                resArray[index] =array[i];
                System.out.print(resArray[index] + " ");
                index++;
            }

        }*/

        /*System.out.println("4. Посчитать число жителей на чётной и нечётной стороне улицы");
        System.out.println("Введите число жителей для каждого дома");

        Scanner scanner = new Scanner(System.in);
        int[] street = new int[10];
        String result = "";
        int countOfCitizensEven =0;
        int countOfCitizensOdd =0;
        for (int i = 0; i < street.length; i++) {
            street[i]= scanner.nextInt();
            if (i%2==0){
                countOfCitizensEven+=street[i];
                result=result+" "+street[i];
            } else{
                countOfCitizensOdd+=street[i];
            }

        }

        if (countOfCitizensEven>countOfCitizensOdd){
            System.out.println("Жителей на чётной стороне больше");
        } else if (countOfCitizensEven<countOfCitizensOdd) {
            System.out.println("Жителей на нечётной стороне больше");
        }else {
            System.out.println("Жителей поровну");
        }

        System.out.println(result);
        System.out.println(countOfCitizensEven);
        System.out.println(countOfCitizensOdd);*/

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);

        int lenght= data.length;
        System.out.println(lenght);

        String str1 = "Hello World!";
        int lenghtOfString= str1.length();
        System.out.println(lenghtOfString);

        String str2 = "Hello ";
        String str3 = "World!";

        String str4 = str2.concat(str3);

        System.out.println(str4);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1.equals(str4));

        String str5 = "hELlo WOrLD!";
        System.out.println(str5);
        System.out.println(str1.equalsIgnoreCase(str5));



    }
}
