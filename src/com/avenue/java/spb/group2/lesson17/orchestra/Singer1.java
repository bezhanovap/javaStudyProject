package com.avenue.java.spb.group2.lesson17.orchestra;

public class Singer1 extends Thread{
    @Override
    public void run() {
        while (true){

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
        }
    }
}
