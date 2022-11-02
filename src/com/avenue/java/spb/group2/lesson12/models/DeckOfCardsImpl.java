package com.avenue.java.spb.group2.lesson12.models;

import com.avenue.java.spb.group2.lesson12.interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    // Поля
    CardImpl[] cards =new CardImpl[52];

    // Конструктор
    public DeckOfCardsImpl() {
        cards[0]=new CardImpl("Двойка Треф", 2);
        cards[1]=new CardImpl("Двойка Червей", 2);
        cards[2]=new CardImpl("Двойка Бубен", 2);
        cards[3]=new CardImpl("Двойка Пик", 2);

        cards[4]=new CardImpl("Тройка Треф", 3);
        cards[5]=new CardImpl("Тройка Червей", 3);
        cards[6]=new CardImpl("Тройка Бубен", 3);
        cards[7]=new CardImpl("Тройка Пик", 3);

        cards[8]=new CardImpl("Четвёрка Треф", 4);
        cards[9]=new CardImpl("Четвёрка Червей", 4);
        cards[10]=new CardImpl("Четвёрка Бубен", 4);
        cards[11]=new CardImpl("Четвёрка Пик", 4);

        cards[12]=new CardImpl("Пятёрка Треф", 5);
        cards[13]=new CardImpl("Пятёрка Червей", 5);
        cards[14]=new CardImpl("Пятёрка Бубен", 5);
        cards[15]=new CardImpl("Пятёрка Пик", 5);

        cards[16]=new CardImpl("Шестёрка Треф", 6);
        cards[17]=new CardImpl("Шестёрка Червей", 6);
        cards[18]=new CardImpl("Шестёрка Бубен", 6);
        cards[19]=new CardImpl("Шестёрка Пик", 6);

        cards[20]=new CardImpl("Семёрка Треф", 7);
        cards[21]=new CardImpl("Семёрка Червей", 7);
        cards[22]=new CardImpl("Семёрка Бубен", 7);
        cards[23]=new CardImpl("Семёрка Пик", 7);

        cards[24]=new CardImpl("Восьмёрка Треф", 8);
        cards[25]=new CardImpl("Восьмёрка Червей", 8);
        cards[26]=new CardImpl("Восьмёрка Бубен", 8);
        cards[27]=new CardImpl("Восьмёрка Пик", 8);

        cards[28]=new CardImpl("Девятка Треф", 9);
        cards[29]=new CardImpl("Девятка Червей", 9);
        cards[30]=new CardImpl("Девятка Бубен", 9);
        cards[31]=new CardImpl("Девятка Пик", 9);

        cards[32]=new CardImpl("Десятка Треф", 10);
        cards[33]=new CardImpl("Десятка Червей", 10);
        cards[34]=new CardImpl("Десятка Бубен", 10);
        cards[35]=new CardImpl("Десятка Пик", 10);

        cards[36]=new CardImpl("Валет Треф", 10);
        cards[37]=new CardImpl("Валет Червей", 10);
        cards[38]=new CardImpl("Валет Бубен", 10);
        cards[39]=new CardImpl("Валет Пик", 10);

        cards[40]=new CardImpl("Дама Треф", 10);
        cards[41]=new CardImpl("Дама Червей", 10);
        cards[42]=new CardImpl("Дама Бубен", 10);
        cards[43]=new CardImpl("Дама Пик", 10);

        cards[44]=new CardImpl("Король Треф", 10);
        cards[45]=new CardImpl("Король Червей", 10);
        cards[46]=new CardImpl("Король Бубен", 10);
        cards[47]=new CardImpl("Король Пик", 10);

        cards[48]=new CardImpl("Туз Треф", 11);
        cards[49]=new CardImpl("Туз Червей", 11);
        cards[50]=new CardImpl("Туз Бубен", 11);
        cards[51]=new CardImpl("Туз Пик", 11);

    }

    //Методы
    @Override
    public CardImpl randomCards() {
        int randomIndex=ThreadLocalRandom.current().nextInt(0, cards.length);
        return cards[randomIndex];
    }
}
