package com.avenue.java.spb.group2.lesson11;

import java.util.Random;

public class SaperGame {
    // Поля
    public int[][] map;

    // Конструкторы


    // Методы

    // Расставить бомбы в массиве в виде значений "-1"
    public void bombsByLevel(int level) {

        int bombCount; // Количество бомб
        int mapWidth; // Количество ячеек в ширину
        int mapHeight; // Количество ячеек в высоту

        // В соответствии с выбранным уровнем зададим основные параметры игры - размер поля и количество бомб
        switch (level) {
            case 1:
                bombCount = 99;
                mapWidth=30;
                mapHeight=16;
                break;
            case 2:
                bombCount = 40;
                mapWidth=16;
                mapHeight=16;
                break;
            case 3:
                bombCount = 10;
                mapWidth=10;
                mapHeight=10;
                // В оригинальной игре 9*9
                /*mapWidth=9;
                mapHeight=9;*/
                break;
            default:
                bombCount = 10;
                mapWidth=9;
                mapHeight=9;
                break;
        }

        // Зададим размер массива
        map= new int[mapHeight][mapWidth];

        // Заполним карту бомбами
        for (int i = 0; i < bombCount; i++) {

            // Воспользуемся генератором и получим два случайных числа - координаты ячейки
            Random random = new Random();
            int x = random.nextInt(mapWidth);
            int y = random.nextInt(mapHeight);

            // По условиям игры в угловых ячейках бомба не ставится
            // Также не будем ставить бомбу в ячейку, где уже есть бомба
            if (!(map[y][x]==-1) &&
                    !(x == 0 && y == 0) &&
                    !(x == bombCount - 1 && y == bombCount - 1) &&
                    !(x == 0 && y == bombCount - 1) &&
                    !(x == bombCount - 1 && y == 0)){
                map[y][x] = -1;
            }else{
                i--;
            }
        }

        // Распечатаем карту
        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                if (map[i][j] == -1) {
                    System.out.print(" " + map[i][j]);
                } else {
                    System.out.print("  " + map[i][j]);
                }
            }
            System.out.println();

        }


    }
}
