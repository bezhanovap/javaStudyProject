package com.avenue.java.spb.group2.lesson7;

public class lesson7 {
    public static void main(String[] args) throws InterruptedException {

        // Задача 1. Написать таймер

        /*for (int days = 0; days < 365; days++) { //Счётчик дней
            for (int hours = 0; hours <= 24; hours++) {//Счётчик часов
                for (int minutes = 0; minutes < 60; minutes++) {//Минуты
                    for (int seconds = 0; seconds < 60; seconds++) {//Секунды
                        Thread.sleep(1000);
                        // Форматированный вывод
                        // Переменные идут через:
                        // %d - числовые типы, %s- строковые типы, \n - перевод каретки\строки(абзац)
                        System.out.printf("Прошло %d дней, %d часов, %d минут, %d секунд\n", days, hours, minutes, seconds);
                    }

                }

            }

        }*/

        // Двумерные массивы
        /*int[][] doubleArray = new int[5][];
        int[][] doubArray = {{5, 5, 8},
                {6, 7, 8, 9, 10},
                {1, 0,}};

        for (int i = 0; i < doubArray.length; i++) {
            for (int j = 0; j < doubArray[i].length; j++) {
                System.out.print(doubArray[i][j] + " ");
            }
            System.out.println();

        }*/

        // Задача 2. Наполнение двумерного массива цифрами от 10 и дальше +5
        int[][] numbers2 = new int[5][5];
        int count = 10;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                numbers2[i][j] = count;
                count += 5;
                //System.out.print(numbers2[i][j] + " ");
            }
            //System.out.println();

        }

        // Задача 3. Распечатать двумерный массив по диагонали
        /*for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j <numbers2[i].length ; j++) {
                if (i==j) {
                    System.out.print(numbers2[i][j]+" ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }*/

        // Задача 4. Распечатать двумерный массив d шахматном порядке начиная с 00
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(numbers2[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }


    }
}
