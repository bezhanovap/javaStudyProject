package com.avenue.java.spb.group2.lesson8;

import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
        /**Методы-
         Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы.
         Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;

         Формула создания метода-
         1 - модификатор доступа - это одно из 4-х видов слов, указывается перед методом или классом:

         public - метод/класс будет доступен внутри всех пакетов всего проекта
         (99% случоев используется);

         protected - внутри пакета и его наследникам, то есть дочерним классам,
         расположенных в других пакетах в данном проекте;

         ————— (package-private)- будет доступен только внутри текущего пакета (текущей папки);

         private - только внутри текущего класса (файла);

         2 - Статичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static;
         static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);

         3 - Возвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ******  - прочие варианты возвращаемых типов;
         public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;

         4 - Название метода: поясняющее его суть, с моленькай буквы;

         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа

         6 - тело метода (то что должно происходить, когда метод вызовут);
         public static void         printMassiveToConsole(int[][] mass)
         Модификаторы доступа метода      Сигнатура метода
         */

        /*Scanner scanner=new Scanner(System.in);
        String[] strings = new String[100];
        int count=0;
        while (true){
            String str = scanner.nextLine();
            if (str.isEmpty()){
                break;
            }
            System.out.println("Введите слово");
            strings[count]=str.toUpperCase();
            count++;
        }

        for (int i = 0; i < 3; i++) {
            if (strings[i].length()%2==0) {
                System.out.println(strings[i]+" "+strings[i]);
            }else{
                System.out.println(strings[i]+" "+strings[i]+" "+strings[i]);
            }
        }*/

        /*Задача
            1 Создать массив на 20 чисел
            2 Ввести в него значения с клавиатуры
            3 Создать два массива на 10 чисел
            3.1 Отсортировать массив на 20 чисел
            4. Скопировать большой массив на 20 чисел в два маленьких: половину в первый маленький, а вторую во второй
            5. Вывести второй маленький массив на экран, каждое значение с новой строки   */

        Scanner scanner=new Scanner(System.in);

        int [] bigArray =new int[20];
        int [] smallArray1 =new int[10];
        int [] smallArray2 =new int[10];

        // зАПОЛНИМ МАССИВ
        for (int i = 0; i < bigArray.length; i++) {
            System.out.println("Введите число");
            bigArray[i]=Integer.parseInt(scanner.nextLine());
        }

        //Отсортируем
        int tempValue;
        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < bigArray.length; j++) {
                if (bigArray[i]<bigArray[j]){
                    tempValue=bigArray[i];
                    bigArray[i]=bigArray[j];
                    bigArray[j]=tempValue;
                }
            }
        }

        // Разделим на два массива
        int halfOfArray= bigArray.length/2;

        for (int i = 0; i < bigArray.length; i++) {
            if (i<halfOfArray){
                smallArray1[i]=bigArray[i];
            }else{
                smallArray2[i-halfOfArray]=bigArray[i];
            }
        }

        // Распечатаем

        for (int i = 0; i < smallArray2.length; i++) {
            System.out.println(smallArray2[i]);
        }

    }
}

