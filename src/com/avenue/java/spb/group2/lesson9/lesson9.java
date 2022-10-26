package com.avenue.java.spb.group2.lesson9;

import com.avenue.java.spb.group2.lesson8.PhoneBook;

import java.util.ArrayList;

public class lesson9 {
    public static void main(String[] args) {
        /**
         * ООП - объектно-ориентированное программирование. Основные принципы:
         1. Инкапсуляция - область видимости, реализована через модификаторы доступа:
         public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случаев использует
         protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других ＿
         --------- будет доступен только внутри текущего пакета (текущей папки);
         private - только внутри текущего класса (файла);

         2. Наследование - extends - это механизм, который позволяет создавать классы на основе
         других классов наследуя их метады в дочерних (подчиненных) классах.

         3. Абстракция - означает выделение главных, наиболее значимых характеристик предмета и
         нооборот - отбрасывание второстепенных, незначительных.

         4. Полиморфизм - это способность программы идентично использовать объекты с одинаковым интерфейсом
         без информации о конкретном типе этого объекта.
         Мы можем работать со многими типами, как с одним (при условии, что эти типы являются производными (дочерними)
         от базового (разового) типа).
         * */



        /**
         Для проверки можно ли наследоваться слово extends нужно заменить на "ЯВЛЯЕТСя ли",
         при однозначном ДА можно наследоват Если создать массив Человек[] люди = Человек[5];
         Тогда в нем можно хранить объекты подчиненных классов Ученик и Работник, а также ниже по иерархии,
         например ученик может делиться на первоклассников
         и старшеклассников.
         * */


        /*PhoneBook phoneBook=new PhoneBook();

        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.eat();
        dog.say();
        cat.eat();
        cat.say();*/

        // Задача 1. Написать классы с музыкальными дисками и дисками с фильмами.

        DiskVideo diskVideo1=new DiskVideo();
        diskVideo1.setName("Rembo");
        diskVideo1.setDirector("Mark Polo");
        diskVideo1.setGenre("Action");
        diskVideo1.setTime(120);
        diskVideo1.setYear(1982);

        DiskVideo diskVideo2=new DiskVideo();
        diskVideo2.setName("Terminator");
        diskVideo2.setDirector("Гайдай");
        diskVideo2.setGenre("Fantastic");
        diskVideo2.setTime(90);
        diskVideo2.setYear(1984);

        DiskAudio diskAudio1=new DiskAudio();
        diskAudio1.setName("Руки вверх");
        diskAudio1.setYear(1995);
        diskAudio1.setCountTrack(12);
        diskAudio1.setSinger("С. Жуков");

        DiskAudio diskAudio2=new DiskAudio();
        diskAudio2.setName("Ласковый май");
        diskAudio2.setYear(1987);
        diskAudio2.setCountTrack(11);
        diskAudio2.setSinger("Ю. Шатунов");

        diskAudio1.printInfo();
        diskAudio2.printInfo();
        diskVideo1.printInfo();
        diskVideo2.printInfo();

        Disk[] disks=new Disk[4];
        disks[0] = diskAudio1;
        disks[1] = diskAudio2;
        disks[2] = diskVideo1;
        disks[3] = diskVideo2;

        UtilDisk.findOldDisk(disks);





        ZAnimal zAnimal=new ZAnimal();
        zAnimal.eat();

        ZDog zDog=new ZDog();
        zDog.eat();
        zDog.bark();



        ZCat zCat=new ZCat();


        test(zAnimal);
        test(zDog);
        test(zCat);


    }

    public static void test(ZAnimal zAnimal){
        zAnimal.eat();
    }
}

