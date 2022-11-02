package com.avenue.java.spb.group2.lesson12.models;

import com.avenue.java.spb.group2.lesson12.interfaces.Card;

public class CardImpl implements Card {
    // Поля
    private int value;
    private String nameCard;


    // Конструктор

    public CardImpl(String nameCard, int value) {
        this.nameCard = nameCard;
        this.value = value;
    }


    //Методы

    @Override
    public void printCard() {
        System.out.println(nameCard);
    }

    @Override
    public int getValue() {
        return value;
    }

    public String getNameCard() {
        return nameCard;
    }

}
