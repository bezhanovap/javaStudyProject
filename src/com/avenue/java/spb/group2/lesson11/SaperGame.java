package com.avenue.java.spb.group2.lesson11;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperGame {
    // Поля
    public int rows; // Количество строк
    public int columns; // Количество столбцов
    public int[][] mapGame; // Скрытое поле с бомбами
    public int[][] visibleMap; // Видимое поле

    // Конструкторы


    // Методы

    // Расставить бомбы в массиве в виде значений "-1"
    public void bombsByLevel(int level) {

        int bombCount; // Количество бомб

        // В соответствии с выбранным уровнем зададим основные параметры игры - размер поля и количество бомб
        switch (level) {
            case 1:
                bombCount = 99;
                columns = 30;
                rows = 16;
                break;
            case 2:
                bombCount = 40;
                columns = 16;
                rows = 16;
                break;
            case 3:
                bombCount = 10;
                columns = 10;
                rows = 10;
                // В оригинальной игре 9*9
                /*mapWidth=9;
                mapHeight=9;*/
                break;
            default:
                bombCount = 10;
                columns = 9;
                rows = 9;
                break;
        }

        // Зададим размер массива
        mapGame = new int[rows][columns];
        visibleMap = new int[rows][columns];

        // Заполним карту бомбами
        this.fillBombMap(bombCount);

    }


    // Расставим все бомбы на карте
    private void fillBombMap(int bombCount) {
        for (int i = 0; i < bombCount; i++) {
            this.addRandomBomb();
        }
    }


    // Установка бомбы на карте
    public void addRandomBomb() {
        // Воспользуемся генератором и получим два случайных числа - координаты ячейки
        int row = ThreadLocalRandom.current().nextInt(0, rows);
        int column = ThreadLocalRandom.current().nextInt(0, columns);

        // По условиям игры в угловых ячейках бомба не ставится
        // Также не будем ставить бомбу в ячейку, где уже есть бомба
        if ((mapGame[row][column] != -1) &&
                (column != 0 && row != 0) &&
                (column != columns && row != rows) &&
                (column != 0 && row != rows) &&
                (column != columns && row != 0)) {
            mapGame[row][column] = -1;
        } else {
            this.addRandomBomb();
        }
    }


    // Расставим цифры
    public void placeHelpNumbersOnMap() {
        for (int i = 0; i < mapGame.length; i++) { //Строки
            for (int j = 0; j < mapGame[i].length; j++) { // Колонки
                if (mapGame[i][j] == -1) {
                    for (int k = i - 1; k < i + 1; k++) { //Строки возле бомбы
                        for (int l = j - 1; l < j + 1; l++) { // Колонки возле бомбы
                            if ((k >= 0 && k < mapGame.length) && (l >= 0 && l < mapGame[i].length) && mapGame[k][l] != -1) {
                                mapGame[k][l]++;
                            }
                        }

                    }
                }
            }

        }
    }


    // Распечатаем карту в зависимости от её размера
    public void printMapGame() {
        if (mapGame.length>10){
            printBigField();
        }else{
            printSmallField();
        }
    }

    private void printBigField() {
        String columnNumbers = "      ";
        String columnDelimiter= "      ";

        // Генерируем номера столбцов
        for (int i = 0; i < mapGame[0].length; i++) {
            if (i<10) {
                columnNumbers += "  " + i + "  ";
            }else{
                columnNumbers += "  " + i + " ";
            }
            columnDelimiter += "—————";
        }
        System.out.println(columnNumbers);
        System.out.println(columnDelimiter);

        // Генерируем строки с их номерами
        for (int i = 0; i < mapGame.length; i++) {
            if (i<10) {
                System.out.print("  " + i + "  |");
            }else{
                System.out.print("  " + i + " |");
            }

            for (int j = 0; j < mapGame[i].length; j++) {
                if (visibleMap[i][j] == 1) {
                    if (mapGame[i][j] == 0) {
                        System.out.print("    ");
                    } else if (mapGame[i][j] == -1) {
                        System.out.print(" БАХ ");
                    } else {
                        System.out.print("  " + mapGame[i][j] + "  ");
                    }
                } else {
                    System.out.print("  *  ");
                }
            }
            System.out.println();
        }
    }

    private void printSmallField() {
        String columnNumbers = "    ";
        String columnDelimiter= "    ";

        for (int i = 0; i < mapGame.length; i++) {
            columnNumbers += " " + i + " ";
            columnDelimiter += "———";
        }
        System.out.println(columnNumbers);
        System.out.println(columnDelimiter);
        for (int i = 0; i < mapGame.length; i++) {
            System.out.print(" " + i + " |");

            for (int j = 0; j < mapGame[i].length; j++) {
                if (visibleMap[i][j] == 1) {
                    if (mapGame[i][j] == 0) {
                        System.out.print("   ");
                    } else if (mapGame[i][j] == -1) {
                        System.out.print("БАХ");
                    } else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }
                } else {
                    System.out.print(" * ");
                }


                /*if (mapGame[i][j] == -1) {
                    System.out.print(" " + mapGame[i][j]);
                } else {
                    System.out.print("  " + mapGame[i][j]);
                }*/
            }
            System.out.println();
        }
    }

    // Делаем ход и проверяем поле
    public boolean doStep() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите номер строки:");
        int stepRow= scanner.nextInt();

        System.out.println("Введите номер столбца:");
        int stepColumn= scanner.nextInt();

        if (stepRow<0 || stepRow>rows || stepColumn<0 || stepColumn>columns){
            return doStep();
        }else{
            if (mapGame[stepRow][stepColumn]!=-1){
                visibleMap[stepRow][stepColumn]=1;
                printMapGame();
                return true;
            }else{
                visibleMap[stepRow][stepColumn]=1;
                printMapGame();
                return false;
            }
        }
    }

}
