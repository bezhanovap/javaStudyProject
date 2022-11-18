package com.avenue.java.spb.group2.lesson17.homework;

public class Task4 {
/*4
        1. Разберись, что делает программа.
        2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе (время, которое передали в конструктор, не выводить).

    Пример:
    В г. Лондон сейчас 23:59:58!
    В г. Лондон сейчас 23:59:59!
    В г. Лондон сейчас полночь!
    В г. Лондон сейчас 0:0:1!*/

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
                e.printStackTrace();
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут

            for (int hour = hours; hour <24 ; hour++) {
                // Переприсвоим значение переменной
                hours=hour;
                for (int minute = minutes; minute < 60; minute++) {
                    minutes=minute;
                    for (int second = seconds; second < 60; second++) {
                        seconds=second;
                        Thread.sleep(1000);

                        if (hours == 0 && minutes == 0 && seconds == 0) {
                            System.out.println(String.format("В г. %s сейчас полночь!", cityName));
                        } else {
                            System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
                        }

                    }
                    // Обнулим счётчик по окончании цикла
                    seconds=0;
                }
                // Обнулим счётчик по окончании цикла
                minutes=0;
            }
            // Обнулим счётчик по окончании цикла
            hours=0;
        }
    }
}
