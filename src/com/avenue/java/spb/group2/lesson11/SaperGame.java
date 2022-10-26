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
        int sideX; // Количество ячеек в ширину
        int sideY; // Количество ячеек в высоту

        // В соответствии с выбранным уровнем зададим основные параметры игры - размер поля и количество бомб
        switch (level) {
            case 1:
                bombCount = 99;
                sideX=30;
                sideY=16;
                break;
            case 2:
                bombCount = 40;
                sideX=16;
                sideY=16;
                break;
            case 3:
                bombCount = 10;
                sideX=10;
                sideY=10;
                // В оригинальной игре 9*9
                /*sideX=9;
                sideY=9;*/
                break;
            default:
                bombCount = 10;
                sideX=9;
                sideY=9;
                break;
        }

        // Зададим размер массива
        map= new int[sideY][sideX];

        // Заполним карту бомбами
        for (int i = 0; i < bombCount; i++) {

            // Воспользуемся генератором и получим два случайных числа - координаты ячейки
            Random r = new Random();
            int x = r.nextInt(sideX);
            int y = r.nextInt(sideY);

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
        for (int i = 0; i < sideY; i++) {
            for (int j = 0; j < sideX; j++) {
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
