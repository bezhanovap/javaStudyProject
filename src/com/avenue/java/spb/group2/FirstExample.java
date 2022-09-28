package com.avenue.java.spb.group2;

public class FirstExample {

    public static int varA = 1;
    public static int varB = 3;
    public static int varC = 9;
    public static int varD = 27;

    public static void main(String[] args) {

        /*Task1
        Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        */
        int money = 5; //Денег у бухгалтера
        int cashBox = 2; // количество касс
        double inEachCashBox = (double) money / cashBox; //вычисляем количество денег в каждой кассе

        System.out.println("Задача1. \nХитрый бухгалтер разделил 5 рублей на 2 кассы. \nСколько рублей лежит в каждой кассе?");

        System.out.println("Ответ: \nВ каждой кассе лежит: " + inEachCashBox + " руб.");
        System.out.println("\n--------------------------------------------------------------------\n");


        /*Task2
        Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
        */
        int sideA = 50; //Сторона a
        int sideB = 20; //Сторона b
        int square = sideA * sideB; // Считаем площадь перемножая стороны

        System.out.println("Задача 2. \nДано: Стороны квадрата a = 50, b = 20. \nНайти площадь.");

        System.out.println("Ответ: \nУ квадрата все стороны равны," +
                " поэтому будем искать площадь прямоугольника. \nПлощадь равна: " + square);
        System.out.println("\n--------------------------------------------------------------------\n");


        /*Task3
        Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
         насколько быстрее голодный Вася съедает один банан?
        */
        int countOfBananas = 3; //Количество бананов
        int hungryVasyaTime = 9; // время за которое съедает голодный
        int notHungryVasyaTime = 15; // время, когда сыт

        // Определим время, за которое Вася съедает один банан когда голоден
        int oneBananaHungryVasyaTime = hungryVasyaTime / countOfBananas;

        // Определим время, за которое Вася съедает один банан когда сыт
        int oneBananaNotHungryVasyaTime = notHungryVasyaTime / countOfBananas;

        //найдём разницу во времени поедания банана. Из времени поедания, когда Вася сыт вычтем время, когда голоден
        int deltaTime = oneBananaNotHungryVasyaTime - oneBananaHungryVasyaTime;

        System.out.println("Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,\n" +
                " насколько быстрее голодный Вася съедает один банан?");

        System.out.println("Ответ: \nГолодный Вася съедает один банан на " + deltaTime + " мин. быстрее");
        System.out.println("\n--------------------------------------------------------------------\n");


        /*Task4
        Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12"
        public class Application {
            public static void main(String[] args) {
                int a = 3;
                int a = 10;
                int b = 6;
                int b = 12;
                int sum = 1 + a + b;
                int sum = 2 + a + b;
                int sum = 3 + a + b;
                int sum = 4 + a + b;

                System.out.println("sum = " + sum);
            }
        }
        */
        int a = 3;
        //int a = 10;
        int b = 6;
        //int b = 12;
        //int sum = 1 + a + b;
        //int sum = 2 + a + b;
        int sum = 3 + a + b;
        //int sum = 4 + a + b;

        System.out.println("sum = " + sum);

        System.out.println("\n--------------------------------------------------------------------\n");



        /*Task5
        Задача 5. В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
        Знаки нужно расставить только в строчке, в которой объявляется переменная result.
        Порядок следования переменных в этой строке изменять нельзя.
        Перед каждой переменной должен стоять знак либо плюс, либо минус.

        public class Application {
            public static int a = 1;
            public static int b = 3;
            public static int c = 9;
            public static int d = 27;

            public static void main(String[] args) {

                int result = +a + b + c + d;

                System.out.println(result);
            }
        }

        */
        int result = -varA + varB - varC + varD;

        System.out.println(result);


    }
}
