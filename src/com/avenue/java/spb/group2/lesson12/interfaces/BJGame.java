package com.avenue.java.spb.group2.lesson12.interfaces;

import com.avenue.java.spb.group2.lesson12.models.PlayerImpl;

public interface BJGame {
    //  Добавлять игроков в игру
    void addPlayerToGame(PlayerImpl player);

    // Раздавать по две карты каждому игроку на старте
    void giveToPlayersTwoCardsOnStart();

    // Раздавать карты, пока это требуется игрокам
    void giveCardToPlayerIfNeed();

    // Определить победителя
    void determineWinner();
    int countPlayersInGame();

    void numberOfPlayersInGame(int numPlayers);
}
