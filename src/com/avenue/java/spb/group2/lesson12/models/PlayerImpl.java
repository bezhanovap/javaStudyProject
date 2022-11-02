package com.avenue.java.spb.group2.lesson12.models;

import com.avenue.java.spb.group2.lesson12.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {

    private String playerName;
    private boolean inGame=true;
    CardImpl[] cardsOnHand=new CardImpl[10];

    @Override
    public void takeCard(CardImpl card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i]==null){
                cardsOnHand[i]=card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int sumValues=0;
        for (CardImpl card :
                cardsOnHand) {
            if (card==null){
                break;
            } else {
                sumValues+=card.getValue();
            }
        }
        return sumValues;
    }

    @Override
    public boolean needCard() {
        System.out.println(this.playerName + ", ваши карты:");
        this.showCardsOnHands();
        System.out.println("Количество очков: "+ countValuesOfAllCardsOnHand());
        System.out.println("Нужна ли ещё карта?");
        Scanner scanner=new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да") || answer.equalsIgnoreCase("д")||answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHands() {
        for (CardImpl card:
             cardsOnHand) {
            if (card==null){
                break;
            }else {
                card.printCard();
            }
        }
    }

    @Override
    public boolean isInGame() {
        return inGame;
    }

    @Override
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public boolean isCroupier() {
        return false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
