package com.avenue.java.spb.group2.lesson6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lesson6 {

    public static void main(String[] args) {
        /**
         String и его основные методы

         1. String - неизменяемый тип
         2. StringBuffer и StringBuilder

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

        /*char data[]= {'a','b','c'};
        String str= new String(data);

        int lenght = data.length;
        System.out.println(lenght);

        String str1 = "Hello World";
        int lenghtOfString = str1.length();
        System.out.println(lenghtOfString);

        String str2=null;
        String str3="World";
        boolean b = str3.equals("World");

        String str4 ="Иванов";
        String str5 = "иванов";
        boolean c = str4.equalsIgnoreCase(str5);
        System.out.println(c);


        for (int i = 0; i < 1000; i++) {
            String text="Hello";
            text+="!";
        }*/

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Задача1. Принять от пользователя текст и перевернуть его" +
                "Пример: Привет! Результат: !тевирП");

        System.out.println("Введите строку");
        String stringLine = scanner.nextLine();
        String stringLineReversed = "";

        for (int i = stringLine.length()-1; i >= 0; i--) {
            stringLineReversed+=stringLine.charAt(i);
        }
        System.out.print(stringLineReversed);*/


        /*System.out.println("Задача2. Поиск и замена символов в тексте");
        System.out.println("/Hello*World!");
        String stringWithError = "/Hello*World!";
        stringWithError=stringWithError.replace("*"," ");
        stringWithError=stringWithError.replace("/","");
        System.out.println(stringWithError);*/


        System.out.println("Задача3. Проверить e-mail на наличие @ ");
        System.out.println("Введите свою почту");
        String eMail=scanner.nextLine();

        //1 mail@yandex.ru
        if (eMail.indexOf("@")==-1){
            System.out.println("Ошибка. Введите правильный адрес почты");
            return;
        }

        //2 mail@yandex@ru
        String[] arr = eMail.split("@");
        if (arr.length!=2){
            System.out.println("e-mail содержит более 1 символа @");
            return;
        }


        //3 .mail.@.yandex.ru
        String partBeforeDog=arr[0];
        String partAfterDog=arr[1];
        if (partBeforeDog.startsWith(".") || partBeforeDog.endsWith(".")){
            System.out.println("Некорректный e-mail, начинается или заканчивется точкой");
            return;
        }
        if (partAfterDog.startsWith(".") || partAfterDog.endsWith(".")){
            System.out.println("Некорректный e-mail, начинается или заканчивется точкой");
            return;
        }

        //4
        if (eMail.contains(" ")){
            eMail=eMail.trim();
        }

        //5 mAil@yAndex.ru
        if (eMail.contains("A")) {
            eMail=eMail.toLowerCase();
        }

        //6
        if (eMail.contains("a")) {
            eMail=eMail.toUpperCase();
        }

        System.out.println("e-mail корректный");

    }
}
