package com.avenue.java.spb.group2.lesson9.homework;

public class User {
    // 1. Поля
    private String login;
    private String password;
    private Basket userBasket;

    // 2. Конструкторы

    public User(String login, String password, Basket userBasket) {
        this.login = login;
        this.password = password;
        this.userBasket = userBasket;
    }


    // 3. Методы

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }
}
