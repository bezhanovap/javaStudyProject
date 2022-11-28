package com.avenue.java.spb.group2.lesson17.orchestra;

public class Singer2 extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Monitor.MICROPHONE){
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("FAFAFA---------------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
