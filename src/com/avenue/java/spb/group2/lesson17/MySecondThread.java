package com.avenue.java.spb.group2.lesson17;

public class MySecondThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1000; i < 1030; i++) {
            System.out.println(Thread.currentThread().getName() +" "+ i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
