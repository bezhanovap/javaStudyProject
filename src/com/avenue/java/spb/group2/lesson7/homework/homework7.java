package com.avenue.java.spb.group2.lesson7.homework;

import java.util.Scanner;

public class homework7 {

    //1 Метод возведения в куб
    public static Double cube(Double varA) {
        return varA * varA * varA;
    }

    //2 Метод сравнения с 5
    public static Boolean compareWith5(Double varB){
        return varB>5;
    }

    // 3 Метод сравнения двух чисел и вывода меньшего
    public static Integer compare(Integer varC, Integer varD){
        if (varC <varD){
            return varC;
        }else{
            return varD;
        }
    }

    // 4 Метод возведения в степень, воспользуемся рекурсией, а можно и в цикле посчитать
    public static Double exponent(Double value, Integer power){
        if (power ==1) {
            return value;
        }else{
            return value*exponent(value,power-1);
        }
    }

    // 5 Метод int getInt() - должен считывать с консоли целое число и возвращать его
    public static Double getInt(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число:");
        Double number=Double.parseDouble(scanner.nextLine());
        return number;
    }

    //5 Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую операцию:");
        String operationCharacter = scanner.nextLine();
        if (operationCharacter.trim().length()>1){
            System.out.println("Введите допустимую операцию +, -, *, /");
            return getOperation();
        }else if (operationCharacter.contains("+")){
            return '+';
        } else if (operationCharacter.contains("-")) {
            return '-';
        } else if (operationCharacter.contains("*")) {
            return '*';
        } else if (operationCharacter.contains("/")) {
            return '/';
        }else{
            System.out.println("Введите допустимую операцию +, -, *, /");
            return getOperation();
        }
    }

    //5 Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
    // арифметическую операцию, заданную operation.
    public static Double calc(Double num1, Double num2, char operation){
        if (operation=='+'){
            return (num1+num2);
        } else if (operation=='-') {
            return (num1-num2);
        } else if (operation=='*') {
            return (num1*num2);
        }else {
            return (num1/num2);
        }
    }


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
         public static int - если метод будет возвращать число;
         public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ******  - прочие варианты возвращаемых типов;
         public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;

         4 - Название метода: поясняющее его суть, с моленькай буквы;

         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа

         6 - тело метода (то что должно происходить, когда метод вызовут);
         public static void         printMassiveToConsole(int[][] mass)
         Модификаторы доступа метода      Сигнатура метода
         */

        Scanner scanner = new Scanner(System.in);

        /*1
        Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.*/

        /*System.out.println("Task1");

        System.out.println("Введите число для возведения в куб:");
        Double num1= Double.parseDouble(scanner.nextLine());
        System.out.println(cube(num1));
        System.out.println("\n--------------------------------------------------------------------\n");*/

        /*2
        Напишите метод, который бы возвращал в консоль:
        true, если число больше 5
        и false, если число меньше 5*/

        /*System.out.println("Task2");

        System.out.println("Введите число для сравнения с 5, если больше, то появится - true");
        Integer num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(compareWith5(num2));
        System.out.println("\n--------------------------------------------------------------------\n");*/

        /*3
        Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
        Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.*/

        /*System.out.println("Task3");

        System.out.println("Введите числа для сравнения:");
        Integer num3 = Integer.parseInt(scanner.nextLine());
        Integer num4 = Integer.parseInt(scanner.nextLine());
        System.out.println("Меньшее "+compare(num3,num4));
        System.out.println("\n--------------------------------------------------------------------\n");*/

        /*4
        Необходимо написать метод, который бы возводил число в степень.
        И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.*/

        /*System.out.println("Task4");

        System.out.println("Введите число");
        Double num5 = Double.parseDouble(scanner.nextLine());
        System.out.println("В какую степень возвести?");
        Integer num6 = Integer.parseInt(scanner.nextLine());
        System.out.println("Результат "+exponent(num5,num6));
        System.out.println("\n--------------------------------------------------------------------\n");
*/
        /*5
        Условие задачи:
        Необходимо написать простой консольный калькулятор на Java.

                Метод int getInt() - должен считывать с консоли целое число и возвращать его
        Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
        Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
                Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.*/

        System.out.println("Task5");
        // Т.к. в операциях присутствует деление, то коректно будет это учесть в типе данных и использовать Double
        System.out.println("Результат "+calc(getInt(),getInt(),getOperation()));
        System.out.println("\n--------------------------------------------------------------------\n");

    }
}
