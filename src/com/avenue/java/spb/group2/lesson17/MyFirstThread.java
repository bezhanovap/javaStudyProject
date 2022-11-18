package com.avenue.java.spb.group2.lesson17;

public class MyFirstThread extends Thread{
    @Override
    public void run() {
        for (int i = 100; i < 120; i++) {
            System.out.println("Thread MyFirstThread печатает "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
