package com.avenue.java.spb.group2.lesson17.homework;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /*1
        В методе main добавить в статический объект list 5 нитей.
                Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.

        public static volatile List<Thread> list = new ArrayList<Thread>(5);

        public static void main(String[] args) {
            //напишите тут ваш код
        }

        public static class SpecialThread implements Runnable {
            public void run() {
                System.out.println("it's a run method inside SpecialThread");
            }
        }*/

    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
            list.get(i).start();

        }

        /*Thread firstThread = new Thread(new SpecialThread());
        Thread secondThread = new Thread(new SpecialThread());
        Thread thirdThread = new Thread(new SpecialThread());
        Thread fourthThread = new Thread(new SpecialThread());
        Thread fifthThread = new Thread(new SpecialThread());

        list.add(firstThread);
        list.add(secondThread);
        list.add(thirdThread);
        list.add(fourthThread);
        list.add(fifthThread);

        list.get(0).start();
        list.get(1).start();
        list.get(2).start();
        list.get(3).start();
        list.get(4).start();*/

    }
    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
