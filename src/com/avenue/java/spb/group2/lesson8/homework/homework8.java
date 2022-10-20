package com.avenue.java.spb.group2.lesson8.homework;

import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        /*1. Требования:
        Создать класс Human.
•  Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
•  Добавить в класс конструктор public Human(String name, boolean sex, int age).
•  Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
•  Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
•  Выведи созданные объекты на экран


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

        это переопределенный метод toString(), для печати используйте его*/

        //4 объекта без отца и матери
        Human oleg = new Human("Олег", true, 65);
        Human ivan = new Human("Иван", true, 66);
        Human olga = new Human("Ольга", false, 63);
        Human larisa = new Human("Лариса", false, 64);

        // 5 объектов с отцом и матерью
        Human andrey = new Human("Андрей", true, 27, oleg, larisa);
        Human kirill = new Human("Кирилл", true, 28, oleg, olga);
        Human konstantin = new Human("Константин", true, 29, ivan, olga);
        Human mihail = new Human("Михаил", true, 30, ivan, larisa);
        Human ekaterina = new Human("Екатерина", false, 31, oleg, olga);

        // Создадим список
        ListOfHumans listOfHumans = new ListOfHumans();

        // Добавим в него все элементы
        listOfHumans.addHuman(oleg);
        listOfHumans.addHuman(ivan);
        listOfHumans.addHuman(olga);
        listOfHumans.addHuman(larisa);

        listOfHumans.addHuman(andrey);
        listOfHumans.addHuman(kirill);
        listOfHumans.addHuman(konstantin);
        listOfHumans.addHuman(mihail);
        listOfHumans.addHuman(ekaterina);

        // Распечатаем список
        listOfHumans.printList();

        /*2
        Создать класс Cat (кот) с пятью конструкторами:
        - Имя,
                - Имя, вес, возраст
                - Имя, возраст (вес стандартный)
                - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
        - вес, цвет, адрес (чужой домашний кот)

        Задача конструктора - сделать объект валидным.
        Например, если вес не известен, то нужно указать какой-нибудь средний вес.
        Кот не может ничего не весить.
        То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.*/

        Cat murzik = new Cat("Мурзик");
        Cat alisa = new Cat("Алиса", 3200, 18);
        Cat musya = new Cat("Муся", 28);
        Cat pirat = new Cat( 3900, "Чёрный");
        Cat vasya = new Cat(3200, "Серый", "Соседний двор");





        /*3
        1. Внутри класса Solution создай public static классы Man и Woman.
        2. У классов должны быть поля: name (String), age (int), address (String).
        3. Создай конструкторы, в которые передаются все возможные параметры.
        4. Создай по два объекта каждого класса со всеми данными используя конструктор.
        5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

        В этой задаче можно создавать static class внутри основного класса*/


        /*4
        Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
                Вывести на экран полученную сумму.*/

        System.out.println("Task4");
        System.out.println("Считать сумму чисел, пока не будет введено слово \"сумма\"");
        int sum =0;
        String text=",";
        Scanner scanner=new Scanner(System.in);
        while (!text.isEmpty()){
            text=scanner.nextLine();
            if (text.contains("сумма")){
                System.out.println("Сумма чисел равна:" + sum);
                break;
            } else{
                sum+=Integer.parseInt(text);
            }
        }

        System.out.println("\n--------------------------------------------------------------------\n");


        /*5
        Написать программу, которая:
        1. считывает с консоли число N, которое должно быть больше 0
        2. потом считывает N чисел с консоли
        3. выводит на экран максимальное из введенных N чисел.*/

        System.out.println("Task5");
        int number =0;
        while (number<=0){
            System.out.println("Введите число больше 0 ");
            number=scanner.nextInt();
        }

        int[] arrayN=new int[number];
        // заполним массив
        for (int i = 0; i < number; i++) {
            System.out.println("Введите "+(i+1) +"-е число");
            arrayN[i]= scanner.nextInt();
        }

        // Найдём максимальное
        int maxNumber = arrayN[0];
        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i]>maxNumber){
                maxNumber=arrayN[i];
            }
        }
        System.out.println("Максимальное число " + maxNumber);
        System.out.println("\n--------------------------------------------------------------------\n");


        /*Решения по-прежнему жду в среду вечером.
        Также прошу подготовить какие-либо вопросы по пройденному
        материалу к четвергу, чтобы понять,
        что у вас в головах осело из информации неустойчиво,
        чтобы спокойно разобрать и идти дальше. Удачи!*/

    }
}
