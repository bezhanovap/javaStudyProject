package com.avenue.java.spb.group2.lesson17;

public class Application {
    // public static final Logger LOGGER = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        // LOGGER.debug("message");
        //System.out.println("logger has started");

        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();

        Thread mySecondThread = new Thread(new MySecondThread());
        mySecondThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Поток main печатает " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
