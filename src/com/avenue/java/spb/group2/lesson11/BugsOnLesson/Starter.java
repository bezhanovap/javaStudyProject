package com.avenue.java.spb.group2.lesson11.BugsOnLesson;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        //1. Создание игры
        SaperGame2 saperGame2 = new SaperGame2();

        //2. Спросить сложность у пользователя
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите уровено сложности от 1-3");
        System.out.println("1 - Высокий уровень сложности");
        System.out.println("2 - Средний уровень сложности");
        System.out.println("3 - Низкий уровень сложности");

        int level = scanner.nextInt();

        //3. Настраивать сложность
        saperGame2.bombsByLevel(level);

        // 4. Расставить вспомогательные цифры
        saperGame2.placeHelpNumbersOnMap();

        saperGame2.printMapGame();

        while (true) {
            int check = 0;
            System.out.println("Введите координаты по оси Х от 1 до 10");
            int pointX = scanner.nextInt();
            System.out.println("Введите координаты по оси Y от 1 до 10");
            int pointY = scanner.nextInt();
            if (pointX > 10 || pointX < 0 || pointY > 10 || pointY < 0) {
                System.out.println("Некорректный ввод, выход за поле.");
                continue;
            }
            saperGame2.printMapGame();
            /**
             1 - "Следующий ход" (check=1)
             2 - "Вы уже вводили данные координаты. Введите
             координаты еще раз" (check=2)
             3- "Бомба!!! Вы проиграли!!!" (check=-1)
             4 - "Поздравляю! Вы победили!"
             * */
            check = saperGame2.checkPointsPlayers(pointX, pointY); // 1, 2 , -1
            if (check == 2) {
                System.out.println("Вы уже вводили данные координаты. Введите координаты еще раз");
            } else if (check == 1) {
                System.out.println("Следующий ход");
            } else if (check == -1) {
                System.out.println("Бомба!!! Вы проиграли!!!");
            } else {
                System.out.println("Поздравляю! Вы победили!");
            }
            saperGame2.printMapGame();
        }

    }
}
