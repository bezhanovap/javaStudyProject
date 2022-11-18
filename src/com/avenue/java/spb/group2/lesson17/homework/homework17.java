package com.avenue.java.spb.group2.lesson17.homework;

public class homework17 {
    public static void main(String[] args) {

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

        /*2
        1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
        2. SpecialThread должен выводить в консоль свой стек-трейс.

                Подсказка: main thread уже выводит в консоль свой стек-трейс.*/

/*
        3
        1. Разберись, что делает программа.
        2. Реализуй логику метода printTikTak:
        2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik
        2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak

        public static volatile boolean isStopped = false;

        public static void main(String[] args) throws InterruptedException {
            Clock clock = new Clock();
            Thread.sleep(2000);
            isStopped = true;
            System.out.println("The clock has to be stopped");
            Thread.sleep(2000);
            System.out.println("Double-check");
        }

        public static class Clock extends Thread {
            public Clock() {
                setPriority(MAX_PRIORITY);
                start();
            }

            public void run() {
                try {
                    while (!isStopped) {
                        printTikTak();
                    }
                } catch (InterruptedException e) {
                }
            }

            private void printTikTak() throws InterruptedException {
                //add your code here - добавь код тут
            }
        }
*/


/*
        4
        1. Разберись, что делает программа.
        2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе (время, которое передали в конструктор, не выводить).

                Пример:
        В г. Лондон сейчас 23:59:58!
                В г. Лондон сейчас 23:59:59!
                В г. Лондон сейчас полночь!
                В г. Лондон сейчас 0:0:1!

        public static volatile boolean isStopped = false;

        public static void main(String[] args) throws InterruptedException {
            Clock clock = new Clock("Лондон", 23, 59, 57);
            Thread.sleep(4000);
            isStopped = true;
            Thread.sleep(1000);
        }

        public static class Clock extends Thread {
            private String cityName;
            private int hours;
            private int minutes;
            private int seconds;

            public Clock(String cityName, int hours, int minutes, int seconds) {
                this.cityName = cityName;
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
                start();
            }

            public void run() {
                try {
                    while (!isStopped) {
                        printTime();
                    }
                } catch (InterruptedException e) {
                }
            }

            private void printTime() throws InterruptedException {
                //add your code here - добавь код тут

                if (hours == 0 && minutes == 0 && seconds == 0) {
                    System.out.println(String.format("В г. %s сейчас полночь!", cityName));
                } else {
                    System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
                }
            }
        }

*/



    }
}
