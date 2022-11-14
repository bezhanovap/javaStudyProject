package com.avenue.java.spb.group2.lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class lesson15 {
    public static void main(String[] args) {
        //----------------------------------------------
//        System.out.println("1. Принцип работы Exception");
//        int a=10;
//        int b=0;
//
//        System.out.println(a/b);
//        ArithmeticException arithmeticException=new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(0);
        //----------------------------------------------
//        System.out.println("2. Exception / null");
//        String text=null;
//        System.out.println(text.length());
//        NullPointerException nullPointerException=new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.exit(0);

        //----------------------------------------------
//        System.out.println("3. Обход Exception с помощью if/else");
//        String password=null;
//        if (password!=null){
//            System.out.println(password.length());
//        }
//
//        System.out.println("Продолжение программы");

        //----------------------------------------------
//        System.out.println("4. Обработка Exception без if/else");
//        try {
//            Files.copy(new File("c:/programs/user/desktop/file.jpeg").toPath(),
//                    new File("c:/programs/user/desktop/newfile.jpeg").toPath());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        //----------------------------------------------
//        System.out.println("5. Ещё один пример с try/catch");
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //----------------------------------------------
//        System.out.println("6. Try/catch/finally");
//
//        try {
//            Files.copy(new File("c:/programs/user/desktop/file.jpeg").toPath(),
//                        new File("c:/programs/user/desktop/newfile.jpeg").toPath());
//        } catch (NoSuchFileException e) {
//            e.printStackTrace();
//            System.out.println("File занят другой программой");
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println("Файл не найден");
//        }catch (IOException e){
//            System.out.println("Возникла неведомая ошибка, иди разбирайся");
//        } finally {
//            // взять шаблонный файл, закрыть потоки, почистить кэш, занести запись в лог дополнительную
//        }

        Dog dog=new Dog("Шарик");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
        }

    }
}
