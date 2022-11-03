package com.avenue.java.spb.group2.lesson12.models;

import com.avenue.java.spb.group2.lesson12.interfaces.BJGame;

public class BJGameImpl implements BJGame {
    PlayerImpl[] playersInGame;
    DeckOfCardsImpl deck = new DeckOfCardsImpl();

    public void numberOfPlayersInGame(int numberPlayers) {
        // Тут к количеству игроков добавим ещё 1 - крупье
        this.playersInGame = new PlayerImpl[numberPlayers+1];
    }

    @Override
    public void addPlayerToGame(PlayerImpl player) {

        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveToPlayersTwoCardsOnStart() {
        for (PlayerImpl player :
                playersInGame) {
            if (player==null){
                break;
            }else{
                player.takeCard(deck.randomCards());
                player.takeCard(deck.randomCards());
            }
        }
    }

    @Override
    public void giveCardToPlayerIfNeed() {
        for (PlayerImpl player :
                playersInGame) {
            if (player == null){
                break;
            }else{
                while (player.needCard()) {
                    player.takeCard(deck.randomCards());
                }
            }
        }
    }

    @Override
    public int countPlayersInGame() {
        int players = 0;
        for (PlayerImpl player :
                playersInGame) {
            if (player==null){
                return players;
            } else if (player.isInGame()) {
                players++;
            }
        }
        return players;
    }

    @Override
    public void determineWinner() {
        for (PlayerImpl player :
                playersInGame) {

            if (player == null){
                break;
            }else if (player.countValuesOfAllCardsOnHand() > 21) {
                System.out.println(player.getPlayerName()+", у вас перебор. Ваши очки: " + player.countValuesOfAllCardsOnHand());
                System.out.println("Вы выбываете из игры!");
                System.out.println();
                player.setInGame(false);
            }
        }

        // Чтобы постоянно не вычислять количество оставшихся игроков, поместим это значение в переменную
        int numberOfRemainingPlayers = countPlayersInGame();

        // Вариант 1. Победил крупье, если в игре никого не осталось
        if (numberOfRemainingPlayers == 0) {
            System.out.println("Победило казино");
            // Дальше считать нечего, поэтому закончим определение победителя
            return;
        }

        // Вариант 2. Если в игре остался один игрок, то он и победил
        if (numberOfRemainingPlayers == 1) {
            for (PlayerImpl player :
                    playersInGame) {

                if (player==null){
                    break;
                }else if (player.isInGame() && player.isCroupier()) {
                    System.out.println("Победило казино:");
                    //Напечатаем имя игрока
                    System.out.println(player.getPlayerName());
                    // Распечатаем его карты
                    System.out.println("С картами:");
                    player.showCardsOnHands();
                    System.out.println("Полученные очки: " + player.countValuesOfAllCardsOnHand());
                    // Дальше считать нечего, поэтому закончим определение победителя
                    return;
                }else if (player.isInGame()) {
                    System.out.println("Победил игрок:");
                    //Напечатаем имя игрока
                    System.out.println(player.getPlayerName());
                    // Распечатаем его карты
                    System.out.println("С картами:");
                    player.showCardsOnHands();
                    System.out.println("Полученные очки: " + player.countValuesOfAllCardsOnHand());
                    // Дальше считать нечего, поэтому закончим определение победителя
                    return;
                }
            }
        }

        int bestValue = 0;
        // Вариант 3. Сравнить значения карт игроков и выявить у кого результат лучше
        // Для этого сначала вычислим лучшее значение и внесём его в переменную bestValue
        if (numberOfRemainingPlayers > 1) {
            for (PlayerImpl player :
                    playersInGame) {

                if (player==null){
                    break;
                } else if (player.isInGame() && bestValue < player.countValuesOfAllCardsOnHand()) {
                        bestValue = player.countValuesOfAllCardsOnHand();
                }
            }

        }

        // Посчитаем, количество игроков с лучшим значением
        // А также узнаем, есть ли среди них крупье
        int countOfBestValue=0;
        int playersWithBestValueWithoutCroupier=0;
        for (PlayerImpl player:
                playersInGame) {
            if (player==null){
                break;
            } else if (bestValue == player.countValuesOfAllCardsOnHand()) {
                countOfBestValue++;
                if (!player.isCroupier()){
                    playersWithBestValueWithoutCroupier++;
                }
            }
        }

        System.out.println();
        // Распечатаем игрока(ов) со значением карт, соответствующих лучшему значению bestValue
        if (countOfBestValue==1 && playersWithBestValueWithoutCroupier==0){
            System.out.println("Победило казино:");
        } else if (countOfBestValue==1 && playersWithBestValueWithoutCroupier==1) {
            System.out.println("Победил игрок:");
        } else if (countOfBestValue==playersWithBestValueWithoutCroupier){
            System.out.println("Победили игроки:");
        } else if ((countOfBestValue-playersWithBestValueWithoutCroupier)==1){
            System.out.println("Ровно!:");
        }


        for (PlayerImpl player :
                playersInGame) {
            if (player==null){
                break;
            } else if (player.isInGame() && !player.isCroupier() && bestValue == player.countValuesOfAllCardsOnHand()) {
                //Напечатаем имя игрока
                System.out.println(player.getPlayerName());
                // Распечатаем его карты
                System.out.println("С картами:");
                player.showCardsOnHands(); // ДЗ + вывести его имя на консоль
                System.out.println("Полученные очки: " + player.countValuesOfAllCardsOnHand());
            }else if (player.isInGame() && player.isCroupier() && bestValue == player.countValuesOfAllCardsOnHand()){
                //Раскрываем карты крупье
                System.out.println(player.getPlayerName());
                // Распечатаем его карты
                System.out.println("С картами:");
                player.showCardsOnHands();
                System.out.println("Полученные очки: " + player.countValuesOfAllCardsOnHand());
            }
        }
    }
}
