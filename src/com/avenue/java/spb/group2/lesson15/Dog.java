package com.avenue.java.spb.group2.lesson15;

public class Dog {

    // Поля
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;


    // Конструктор

    public Dog(String name) {
        this.name = name;
    }


    // Методы
    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash(){
        System.out.println("Поводок надет");
        this.isLeashPutOn=true;
    }

    public void putMuzzle(){
        System.out.println("Намордник надет");
        this.isMuzzlePutOn=true;
    }

    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("Идём гулять");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Ура, идём гулять!");
        }else {
            throw new DogIsNotReadyToWalkException("Собака" + name + " не готова!");
        }
    }

}
