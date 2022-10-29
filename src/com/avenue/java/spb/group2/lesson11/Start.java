package com.avenue.java.spb.group2.lesson11;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        //1. Создание игры
        SaperGame saperGame=new SaperGame();

        //2. Спросить сложность игры
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите уровень сложности, от 1 до 3");
        System.out.println("1 - высокий уровень сложности");
        System.out.println("2 - средний уровень сложности");
        System.out.println("3 - низкий уровень сложности");

        int level = scanner.nextInt();

        // 3. Настроим сложность
        saperGame.bombsByLevel(level);

        // 4. Расставим вспомогательные цифры
        saperGame.placeHelpNumbersOnMap();

        // 5. Распечатаем поле с бомбами
        saperGame.printMapGame();

        // 6. Делаем ход
        boolean playing=true;
        while(playing){
            playing=saperGame.doStep();
        }
    }
}
