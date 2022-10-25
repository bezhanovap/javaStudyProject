package com.avenue.java.spb.group2.lesson4.homework;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Task1
        /*Ввести с клавиатуры два числа m и n.
        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

        Пример: m=2, n=4
        8888
        8888*/

        System.out.println("Task1");
        System.out.println("Введите два числа m и n через пробел");

        int numM = scanner.nextInt(); //Число m
        int numN = scanner.nextInt(); //Число n

        String stringLine = ""; //Переменная для формирования строки

        for (int i = 1; i <= numM; i++) {
            for (int j = 1; j <= numN; j++) {
                stringLine = stringLine + "8"; //Формируем строку

            }
            System.out.println(stringLine);
            stringLine = ""; // очищаем строку для следующей итерации
        }
        System.out.println("\n--------------------------------------------------------------------\n");

        //Task2
        /*Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

        Пример вывода на экран:
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
        888888888
        8888888888*/

        System.out.println("Task2");

        int triangleSide=0;

        // Сделаем ограничение, значение должно быть больше 0
        while (triangleSide<=0) {
            System.out.println("Введите размер стороны треугольника");
            triangleSide = scanner.nextInt(); //Сторона треугольника
        }

        String stringLine2 = ""; //Переменная для формирования строки

        for (int i = 1; i <= triangleSide; i++) {
            // Зададим промежуточную переменную, в соответствии с которой будет формироваться строка
            int numberOfCharacters = i;

            for (int j = 1; j <= numberOfCharacters; j++) {
                stringLine2 = stringLine2 + "8"; //Формируем строку
            }
            System.out.println(stringLine2);
            stringLine2 = ""; // очищаем строку для следующей итерации
        }

        System.out.println("\n--------------------------------------------------------------------\n");


        //Task3
        /*Ввести с клавиатуры три числа, вывести на экран среднее из них.
                Т.е. не самое большое и не самое маленькое.
        Если все числа равны, вывести любое из них.*/

        System.out.println("Task3");

        System.out.println("Введите через пробел три числа для их сравнения");

        int firstNum = scanner.nextInt(); //Первое число
        int secondNum = scanner.nextInt(); //Второе
        int thirdNum = scanner.nextInt(); //Третье

        if (firstNum < secondNum && firstNum < thirdNum)  {
            System.out.println("Наименьшее число " + firstNum);
        } else if (secondNum <firstNum && secondNum < thirdNum) {
            System.out.println("Наименьшее число " + secondNum);
        } else if (thirdNum <firstNum && thirdNum <secondNum) {
            System.out.println("Наименьшее число " + thirdNum);
        } else {
            System.out.println("Числа равны " + firstNum);
        }


        // Интересное решение другого учащегося
        /** int a = 10;
         int b = 16;
         int c = 75;

         if ((a - b) * (c - a) >= 0) {
         System.out.print(a);
         } else if ((b - a) * (c - b) >= 0) {
         System.out.print(b);
         } else {
         System.out.print(c);
         }*/

        System.out.println("\n--------------------------------------------------------------------\n");

        //Task4
        /*Вводить с клавиатуры числа.
        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
                -1 должно учитываться в сумме.

        Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

        while (true) {
            int number = считываем число;
            if (проверяем, что number -1)
            break;
        }*/

       System.out.println("Task4");

        System.out.println("Посчитаем сумму чисел. Для завершения введите -1");
        int sumOfNumbers = 0; //Зададим переменную для подсчёта суммы чисел
        while (true){
            System.out.println("Введите число");
            int numFromString = scanner.nextInt(); //Получаем число
            //Если число отличается от -1, то добавляем его в сумму
            if (numFromString != -1){
                sumOfNumbers = sumOfNumbers + numFromString;
            } else {
                //Если число -1, то прибавляем его к сумме и завершаем
                sumOfNumbers = sumOfNumbers + numFromString;
                System.out.println("Сумма введённых чисел = " + sumOfNumbers);
                break;
            }
        }

        System.out.println("\n--------------------------------------------------------------------\n");

        //Task5
        /*Вывести на экран таблицу умножения 10х10 используя цикл while.
        Числа разделить пробелом.

                Пример вывода на экран:
        1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
        4 8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50
        6 12 18 24 30 36 42 48 54 60
        7 14 21 28 35 42 49 56 63 70
        8 16 24 32 40 48 56 64 72 80
        9 18 27 36 45 54 63 72 81 90
        10 20 30 40 50 60 70 80 90 100*/

        System.out.println("Task5");

        //Проверим, что число больше 0
        int multiplicationTable = 0;
        while (multiplicationTable<=0){
            System.out.println("Введите число - размер таблицы умножения");
            multiplicationTable = scanner.nextInt();
        }
        int row=1; // в переменную будет передаваться строка
        int column=1; // в переменную будет передаваться столбец
        String stringLine3 = ""; //Переменная для формирования строки

        while (row<=multiplicationTable){
            while (column<=multiplicationTable){
                stringLine3 = stringLine3 +" " + (row*column); // Формируем строку
                column++;
            }
            System.out.println(stringLine3);
            stringLine3 = ""; // очищаем строку для следующей итерации
            column=1; // Сбрасываем счётчик
            row++;
        }
        System.out.println("\n--------------------------------------------------------------------\n");

        //Task6
        /*Ввести с клавиатуры строку name.
                Ввести с клавиатуры дату рождения (три числа): y, m, d.

                Вывести на экран текст:
        "Меня зовут name.
        Я родился d.m.y"

        Пример вывода:
        Меня зовут Вася.
                Я родился 15.2.1988*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Task6");

        System.out.println("Предстваьтесь, напишите как Вас зовут?");
        String name = sc.nextLine();

        System.out.println("Введите дату рождения");
        int year =1899;
        // Ограничим вводимые значения
        while (year<1900 || year> 2022) {
            System.out.println("введите год");
            year = sc.nextInt();
        }

        int month =0;
        // Ограничим вводимые значения
        while (month<1 || month> 12) {
            System.out.println("введите месяц");
            month = sc.nextInt();
        }

        int maxDaysInMonth;
        // Ограничим вводимые значения


        if (month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12){
            maxDaysInMonth = 31;
        } else if (month == 2) {
            // Выясним какой год, чтобы знать сколько дней в феврале, воспользуемся уже имеющимся решением этой задачи
            if (year % 400 == 0) {
                //високосный
                maxDaysInMonth = 29;
            } else if (year % 100 == 0) {
                // не високосный
                maxDaysInMonth = 28;
            } else if (year % 4 == 0) {
                //високосный
                maxDaysInMonth = 29;
            } else {
                // не високосный
                maxDaysInMonth = 28;
            }
        } else{
            maxDaysInMonth = 30;
        }

        int day =0;
        while (day<1 || day> maxDaysInMonth) {
            System.out.println("введите день");
            day = sc.nextInt();
        }

        System.out.println("Вы указали следующие даннные:");
        System.out.println("Меня зовут "+ name);
        System.out.println("Я родился " + day + "." + month + "." + year);
        System.out.println("\n--------------------------------------------------------------------\n");

    }
}
