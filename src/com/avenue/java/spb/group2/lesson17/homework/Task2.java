package com.avenue.java.spb.group2.lesson17.homework;

public class Task2 {
    public static void main(String[] args) {

        /*2
        1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
        2. SpecialThread должен выводить в консоль свой стек-трейс.

                Подсказка: main thread уже выводит в консоль свой стек-трейс.*/

        Thread task2Thread = new Thread(new SpecialThread());
        task2Thread.start();

    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element :
                    stackTraceElements) {
                System.out.println("File: " + element.getFileName()
                        + " \nClass: " + element.getClassName()
                        + " \nModule: " + element.getModuleName()
                        + " \nMethod: " + element.getMethodName()
                        + " \nLine: " + element.getLineNumber());
                System.out.println();
            }
        }
    }
}
