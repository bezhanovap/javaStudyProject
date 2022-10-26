package com.avenue.java.spb.group2.lesson10;

public class lesson10 {


    public static void main(String[] args) {
        /**
         * Виды классов:
         * Класс - содержит поля, конструкторы и методы
         * Абстрактный класс - такой же как обычный класс, но мы не можем создать его объект.
         - могут быть абстрактные методы могут не быть
         * Интерфейс - такой же как обычный класс, но мы не можем создать его объект
         - все методы только абстрактные
         - все поля public static final. static - общая, final - не изменяемые
         Интерфейс - это как требования, например
         ＿ Samsung＿
         Фотокамера              Файловый менеджер          Органайзер


         - Сделать фото         - Удалить файл

         - Сделать видео        -Переименовать файл
                                - Переместить файл

         Если класс - это как техническая документация к будущему объекты. То интерфейс - как тех.
         задание к техническому проекту (документации)
         * Interface - ключевое слово для создания интерфейса в Java
         * Создать экземпляр интерфейса в Java нельзя * Интерфейс обеспечивает абсолютную абстракцию
         * Интерфейсы не могут иметь конструкторов, потому что мы не можем создать экземпляр интерфейса
         * По умолчанию любой атрибут интерфейса является public, static и final, так что нам не нужно
         определять модификатор доступа
         * По умолчанию методы интерфейса неявно abstract и public
         * Интерфейс в Java не может быть подклассом у другого класса, но он может реализовать другой интерфейс
         * * Ключевое слово implements используется классами для реализации интерфейса
         * Класс, реализующий интерфейс, должен обеспечить реализацию всех его метода, если только это не абстрактны
         * Enum
         * Внутренний безымянный класс
         * Анонимный класс
         * */

        /**
         * 1. Создаем интерфейс Рeоplе и перечисляем методы который должны быть у будущего класса
         2. Создоем интерфейс Employer и перечисляем методы который должны быть у будущего класса Object
         ＿ People＿
         Employer
         *3. Наследуем Employer extends People. Все кто будут реализовывать интерфейс Employer обязаны
         реализовывать методы от Employer u от People
         Object
         People＿
         Employer
         PythonDeveloper JavaDeveloper
         * 4. Создодим класс JavaDeveloper и делаем implements Employer, по красной лампе делаем implements methods
         5. Реализуем метод doWork() в JavaDeveloper
         6. Реализуем нетод keepSalary() в JavaDeveloper
         *7. Но методы String getFullNome() и getAge() будут одинаковы для всех должностей Тогда делаем абстрактный класс AbstrEmployer
         Object
            People＿ (2 метода)
                ＿Employer ＿ (2 метода)
                        |
            AbstrEmployer (+2 метода)
         JavaDevelaper (-2 метода)  PythonDeveloper (-2 метода)
         * */

        JavaDeveloper javaDeveloper=new JavaDeveloper();
        javaDeveloper.setName("JavaDev");
        javaDeveloper.setAge(30);
        javaDeveloper.doWork();
        javaDeveloper.keepSalary();
        System.out.println(javaDeveloper.getFullName());
        System.out.println(javaDeveloper.getAge());

        PythonDeveloper pythonDeveloper=new PythonDeveloper();
        pythonDeveloper.setName("PythonDev");
        pythonDeveloper.setAge(35);
        pythonDeveloper.doWork();
        pythonDeveloper.keepSalary();
        System.out.println(pythonDeveloper.getFullName());
        System.out.println(pythonDeveloper.getAge());

    }
}
