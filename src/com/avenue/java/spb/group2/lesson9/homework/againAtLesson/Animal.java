package com.avenue.java.spb.group2.lesson9.homework.againAtLesson;

public class Animal {

    /*1
        Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
                Dog, Cat, Horse переопределяют методы makeNoise, eat.
                Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
                Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
                Пусть этот метод распечатывает food и location пришедшего на прием животного.
                В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
                В цикле отправляйте их на прием к ветеринару.*/

    // Поля
    private String name;
    private String food;
    private String location;

    // Конструкторы



    // Методы
    public void eat() {
        System.out.println(getName()+ " ест ...");
    }

    public void makeNoise() {
        System.out.println(getName()+ " кричит ...");
    }

    public void sleep() {
        System.out.println(getName()+ " спит ...");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
