package com.avenue.java.spb.group2.lesson12;

import com.avenue.java.spb.group2.lesson12.interfaces.BJGame;
import com.avenue.java.spb.group2.lesson12.interfaces.DeckOfCards;
import com.avenue.java.spb.group2.lesson12.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Игра BlackJack
         * Цель заключается в том, чтобы набрать как можно больше очков, но не более 21 и обыграть нужно крупье.
         * В игре используется от одной до восьми колод. Из-за того что вероятность комбинации блек-джек при большем
         * числе колод ниже, то преимущество игрока уменьшается при увеличении числа колод. При игре с шаффл-машинкой
         * считается, что используется бесконечная колода.
         *
         * Значения очков каждой карты:
         *      от двойки до десятки — от 2 до 10 соответственно;
         *      у туза — 1 или 11 (11 пока общая сумма не больше 21, далее 1);
         *      у т. н. картинок (король, дама, валет) — 10;
         *
         * Если у игрока и дилера число очков на руках равное, то такая ситуация называется «ровно»: за рубежом это
         * называется — пуш (англ. push). В такой ситуации все остаются при своих ставках, никто не выигрывает и не
         * проигрывает. Хотя в казино бывают исключения, и при «push» выигрывает казино
         */


        // 1. Создаем игру
        // 2. Создавать игроков
        // 3. Создаем крупье
        // 4. Добавить игроков и добавить крупье в игру
        // 5. Добавить колоду карт
        // 6. Добавить карты в колоду
        // 7. Раздать по 2 карты каждому игроку
        // 8. Раздавать каждому по 2 карты, пока это требуется
        // 9. Определить победителя


        //                          можно
        // Interface iPlayer                     Class Player
        //                          или будем делать
        // Interface Player                     Class PlayerImpl
        // Player player = new PlayerImpl();


        Scanner scanner=new Scanner(System.in);
        System.out.println("Сыграем?");
        System.out.println("Сколько будет игроков? (можно играть не более 10)");
        int numPlayers= Integer.parseInt(scanner.nextLine());

        // 1. Создаём игру
        BJGame game=new BJGameImpl();
        // Инициализируем массив игроков с заданным количесвтаом
        game.numberOfPlayersInGame(numPlayers);


        // 2. Создаём игроков
        // Максимум у нас 10 игроков!
        PlayerImpl player1=new PlayerImpl();
        PlayerImpl player2=new PlayerImpl();
        PlayerImpl player3=new PlayerImpl();
        PlayerImpl player4=new PlayerImpl();
        PlayerImpl player5=new PlayerImpl();
        PlayerImpl player6=new PlayerImpl();
        PlayerImpl player7=new PlayerImpl();
        PlayerImpl player8=new PlayerImpl();
        PlayerImpl player9=new PlayerImpl();
        PlayerImpl player10=new PlayerImpl();

        // Запросим для каждого ИМЯ
        for (int i = 0; i < numPlayers; i++) {
            if (i==0){
                System.out.println("Введите имя первого игрока");
                player1.setPlayerName(scanner.nextLine());
            } else if (i==1) {
                System.out.println("Введите имя второго игрока");
                player2.setPlayerName(scanner.nextLine());
            } else if (i==2) {
                System.out.println("Введите имя третьего игрока");
                player3.setPlayerName(scanner.nextLine());
            } else if (i==3) {
                System.out.println("Введите имя четвёртого игрока");
                player4.setPlayerName(scanner.nextLine());
            } else if (i==4) {
                System.out.println("Введите имя пятого игрока");
                player5.setPlayerName(scanner.nextLine());
            } else if (i==5) {
                System.out.println("Введите имя шестого игрока");
                player6.setPlayerName(scanner.nextLine());
            } else if (i==6) {
                System.out.println("Введите имя седьмого игрока");
                player7.setPlayerName(scanner.nextLine());
            } else if (i==7) {
                System.out.println("Введите имя восьмого игрока");
                player8.setPlayerName(scanner.nextLine());
            } else if (i==8) {
                System.out.println("Введите имя девятого игрока");
                player9.setPlayerName(scanner.nextLine());
            } else if (i==9) {
                System.out.println("Введите имя десятого игрока");
                player10.setPlayerName(scanner.nextLine());
            }
        }




        // 3. Создаём крупье
        Croupier croupier=new Croupier();
        croupier.setPlayerName("Крупье");

        // 4. Добавляем игроков и крупье в игру
        for (int i = 0; i < numPlayers; i++) {
            if (i==0){
                game.addPlayerToGame(player1);
            } else if (i==1) {
                game.addPlayerToGame(player2);
            } else if (i==2) {
                game.addPlayerToGame(player3);
            } else if (i==3) {
                game.addPlayerToGame(player4);
            } else if (i==4) {
                game.addPlayerToGame(player5);
            } else if (i==5) {
                game.addPlayerToGame(player6);
            } else if (i==6) {
                game.addPlayerToGame(player7);
            } else if (i==7) {
                game.addPlayerToGame(player8);
            } else if (i==8) {
                game.addPlayerToGame(player9);
            } else if (i==9) {
                game.addPlayerToGame(player10);
            }
        }

        game.addPlayerToGame(croupier);

        // 5. Добавляем колоду карт
        // 6. Добавить карты в колоду - карты уже иницилизированы
        DeckOfCards deckOfCards=new DeckOfCardsImpl();

        // 7. Раздать по 2 карты каждому игроку
        game.giveToPlayersTwoCardsOnStart();

        // 8. Раздавать каждому по 1 карте, пока это требуется
        game.giveCardToPlayerIfNeed();

        // 9. Определить победителя
        game.determineWinner();


        System.out.println();

    }
}
