package com.avenue.java.spb.group2.lesson9.homework;

public class homework9 {
    public static void main(String[] args) {
        /*1

        +Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
        +Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
                +Dog, Cat, Horse переопределяют методы makeNoise, eat.
                +Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
                +Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
                Пусть этот метод распечатывает food и location пришедшего на прием животного.
                +В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
                В цикле отправляйте их на прием к ветеринару.*/

        System.out.println("Task 1");
        // Собака
        Dog dog=new Dog("Собака", "Мясо", "Улице", 5);
        /*dog.setName("Собака");
        dog.setFood("Мясо");
        dog.setLocation("Улице");*/
        dog.sleep();
        dog.eat();
        dog.makeNoise();

        // Кот
        Cat cat=new Cat("Кот", "Мышей", "Батарее", 10);
        /*cat.setName("Кот");
        cat.setFood("Мышей");
        cat.setLocation("Батарее");*/
        cat.sleep();
        cat.eat();
        cat.makeNoise();

        // Лошадь
        Horse horse=new Horse("Лошадь", "Сено и зерно", "Конюшне", true);
        /*horse.setName("Лошадь");
        horse.setFood("Сено и зерно");
        horse.setLocation("Конюшне");*/
        horse.sleep();
        horse.eat();
        horse.makeNoise();

        // Создадим массив животных и добавим в него всех
        Animal[] animals=new Animal[3];
        animals[0]=dog;
        animals[1]=cat;
        animals[2]=horse;

        // Записываем всех к ветеринару
        System.out.println();
        System.out.println("На приёме у ветеринара");
        Veterinarian veterinarian=new Veterinarian();
        for (Animal animal :
                animals) {
            veterinarian.treatAnimal(animal);
        }


        /*2

        Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        Создать класс Категория, имеющий переменные имя и массив товаров.
        Создать несколько объектов класса Категория.
        Создать класс Basket, содержащий массив купленных товаров.
        Создать класс User, содержащий логин, пароль и объект класса Basket.
        Создать объект класса User.*/

        // Добавим 4 продукта
        Product python = new Product("Python book", 1000.0, 4.5);
        Product java = new Product("Java book", 5000.0, 4.9);
        Product samsung = new Product("Samsung", 25000.0, 4.9);
        Product huawei = new Product("Huawei", 15000.0, 2.8);

        // Создадим массивы продуктовых категорий
        Product[] books=new Product[2];
        books[0]=python;
        books[1]=java;

        Product[] smartphones=new Product[2];
        smartphones[0]=samsung;
        smartphones[1]=huawei;

        // Создадим две категории продуктов и в них добавим соответствующие продукты
        Category bookCategory=new Category("Books", books);
        Category smartphoneCategory=new Category("Smartphones", smartphones);

        // Можно также задавать категории не через конструктор, а через set
        /*bookCategory.setProductsArray(books);
        smartphoneCategory.setProductsArray(smartphones);*/



        // Создадим массив купленных товаров
        Product[] purchased=new Product[2];
        purchased[0]=java;
        purchased[1]=samsung;

        // Создадим корзину пользователя
        Basket user1Basket=new Basket(purchased);
        // если бы был конструктор по умолчанию с пустыми параметрами, то можно было бы использоввать user1Basket.setPurchasedGoods(purchased);


        // Создадим пользователя
        User user1=new User("User1", "1234567890", user1Basket);
        // или можно задать корзину пользователя
        /*user1.setUserBasket(user1Basket);*/

        /*3

        Создать класс Person, который содержит:

        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
                Добавьте два конструктора  - Person() и Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).*/

        Person rembo=new Person();
        rembo.setFullName("Сильвестр Сталлоне");
        rembo.setAge(76);

        Person terminator=new Person("Арнольд Шварценеггер",75);

        System.out.println();
        System.out.println("Task 3");
        System.out.println("Напечатаем информацию о героях");
        System.out.println();

        System.out.println("Первый герой: "+ rembo.getFullName()+ ", ему "+ rembo.getAge());
        rembo.move();
        rembo.talk();

        System.out.println();

        System.out.println("Второй герой: "+ terminator.getFullName()+ ", ему "+ terminator.getAge());
        terminator.move();
        terminator.talk();


    }
}
