package com.avenue.java.spb.group2.lesson17.orchestra;

public class Singer1 extends Thread{

    private boolean needStop = false;

    @Override
    public void run() {
        int count=0;

        while (!needStop){

            count++;
            if (count>3){
                needStop=true;
                // Тормозим весь концерт и выходим из цикла, чтобы не передавать действие второму потоку
                break;
            }

            for (int i = 0; i < 3; i++) {

                System.out.println("---------------LALALA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



            synchronized (Monitor.MICROPHONE){
                Monitor.MICROPHONE.notify();
            }

            synchronized (Monitor.MICROPHONE){
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
