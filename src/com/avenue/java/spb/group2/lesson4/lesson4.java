package com.avenue.java.spb.group2.lesson4;

import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        /*System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int checkedNumber = scanner.nextInt();
        if (checkedNumber < 0) {
            System.out.println("Число отрицательное");
        } else if (checkedNumber == 0) {
            System.out.println("Число 0");
        } else {
            System.out.println("Число положительное");
        }*/

        System.out.println("Вывести все чётные числа от 1 до 40");

        for (int i = 1; i < 40; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Вывести числа от 10 до 0");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Сложить числа от 10 до 20");
        int sum = 0;
        for (int i = 10; i <= 20; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("Вывести числа от 10 до 40, пропустив от 15 до 20");
        for (int i = 10; i <= 40; i++) {
            if (i < 15 || i > 20) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Сложить чётные числа от 10 до 50");
        int sum2 = 0;
        for (int i = 10; i <= 50; i++) {
            if (i%2 == 0) {
                sum2 += i;
            }
        }
        System.out.println(sum2);


        /*Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextLine().equals("/exit")){
                break;
            }

        }*/



    }
}
