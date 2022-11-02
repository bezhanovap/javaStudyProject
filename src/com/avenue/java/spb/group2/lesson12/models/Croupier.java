package com.avenue.java.spb.group2.lesson12.models;

public class Croupier extends PlayerImpl{

    @Override
    public boolean isCroupier() {
        return true;
    }

    @Override
    public boolean needCard() {
        if (countValuesOfAllCardsOnHand() >17){
            return false;
        }
        return true;
    }

    @Override
    public boolean isInGame() {
        return super.isInGame();
    }

    @Override
    public void setInGame(boolean inGame) {
        super.setInGame(inGame);
    }
}
