package com.avenue.java.spb.group2.lesson14;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1=new Coin(10,2.9,"Russia",2004);
        Coin coin2=new Coin(10,2.8,"Russia1",2007);
        Coin coin3=new Coin(11,2.8,"Russia2",2010);
        Coin coin4=new Coin(12,2.7,"Russia2",2009);
        Coin coin5=new Coin(13,2.6,"Russia2",2010);

        TreeSet<Coin> hashSet=new TreeSet<>();
        hashSet.add(coin1);
        hashSet.add(coin2);
        hashSet.add(coin3);
        hashSet.add(coin4);
        hashSet.add(coin5);

        for (Coin c :
                hashSet) {
            System.out.println(c);
        }
        System.out.println();
    }
}
