package com.avenue.java.spb.group2.lesson8.homework;

public class Solution {

    public static void main(String[] args) {
        Man oleg = new Man("Олег", 25, "Пушкин");
        Man roman = new Man("Роман", 28, "Колпино");
        Woman veronika = new Woman("Вероника", 29, "Парголово");
        Woman natalya = new Woman("Наталья", 28, "Сосновый бор");

        System.out.println("Имя " + oleg.getName() + " возраст " + oleg.getAge() + " адрес " + oleg.getAddress());
        System.out.println("Имя " + roman.getName() + " возраст " + roman.getAge() + " адрес " + roman.getAddress());
        System.out.println("Имя " + veronika.getName() + " возраст " + veronika.getAge() + " адрес " + veronika.getAddress());
        System.out.println("Имя " + natalya.getName() + " возраст " + natalya.getAge() + " адрес " + natalya.getAddress());

    }

    /*3
        1. Внутри класса Solution создай public static классы Man и Woman.
        2. У классов должны быть поля: name (String), age (int), address (String).
        3. Создай конструкторы, в которые передаются все возможные параметры.
        4. Создай по два объекта каждого класса со всеми данными используя конструктор.
        5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

        В этой задаче можно создавать static class внутри основного класса*/

    public static class Man {
        // Поля
        private String name;
        private int age;
        private String address;

        // Конструкторы
        public Man(String name) {
            this.name = name;
        }

        public Man(int age) {
            this.age = age;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Man(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Методы
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Woman {
        // Поля
        private String name;
        private int age;
        private String address;

        // Конструкторы
        public Woman(String name) {
            this.name = name;
        }

        public Woman(int age) {
            this.age = age;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }


        // Методы
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
