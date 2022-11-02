package com.avenue.java.spb.group2.lesson12.interfaces;

import com.avenue.java.spb.group2.lesson12.models.CardImpl;

public interface Player {
    void takeCard(CardImpl card); // Взять карту из колоды
    int countValuesOfAllCardsOnHand(); // Посчитать количество очков в картах на руках
    boolean needCard(); // Ответить игре нужна ли карта
    void showCardsOnHands(); // Показать карты на руках

    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();
}
