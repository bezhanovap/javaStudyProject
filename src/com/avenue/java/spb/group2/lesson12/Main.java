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

        // 1. Создаём игру
        BJGame game=new BJGameImpl();

        // 2. Создаём игроков
        PlayerImpl player1=new PlayerImpl();
        System.out.println("Введите имя первого игрока");
        player1.setPlayerName(scanner.nextLine());
        PlayerImpl player2=new PlayerImpl();
        System.out.println("Введите имя второго игрока");
        player2.setPlayerName(scanner.nextLine());

        // 3. Создаём крупье
        Croupier croupier=new Croupier();
        croupier.setPlayerName("Крупье");

        // 4. Добавляем игроков и крупье в игру
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
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
