package com.avenue.java.spb.group2.lesson17.orchestra;

public class Leader {
    public static void main(String[] args) {
        System.out.println("Начало нашего концерта");
        Singer1 singer1=new Singer1();
        singer1.start();
        Singer2 singer2=new Singer2();
        singer2.start();

        System.out.println("Конец концерта");
    }
}
