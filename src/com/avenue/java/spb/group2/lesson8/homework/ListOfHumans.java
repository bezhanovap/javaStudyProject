package com.avenue.java.spb.group2.lesson8.homework;

public class ListOfHumans {
    // Поля
    private Human[] humans = new Human[100];

    // Конструкторы

    // Методы

    // Добавление информации
    public void addHuman(Human human) {
        for (int i = 0; i < humans.length; i++) {
            // Если ячейка пустая, то заполняем её
            if (humans[i] == null) {
                humans[i] = human;
                break;
            }
        }
    }

    // Поиск элемента
    public void search(String forSearch) {
        for (Human man :
                humans) {
            if (man != null){
                // Если находим искомый элемент, то печатаем его
                if (man.getName().contains(forSearch)) {
                    System.out.println(man.getName());
                }
            } else{
                System.out.println("Искомый элемент не найден");
                break;
            }

        }
    }

    // Редактирование элемента
    public void edit(String forSearch, String forEdit) {
        for (Human man :
                humans) {
            if (man != null){
                // Если находим искомый элемент, то изменяем его
                if (man.getName().contains(forSearch)) {
                    man.setName(forEdit);
                    break;
                }
            } else{
                System.out.println("Искомый элемент не найден");
                break;
            }
        }
    }

    // Удаление элемента
    public void delete(String forSearch) {

        for (int i = 0; i < humans.length; i++) {
            // Если находим нулевой элемент, то заканчиваем, т.к. дальше ничего нет
            if (humans[i] == null) {
                break;
            } else if (humans[i] != null && humans[i].getName().contains(forSearch)) { // Удаляем запись
                humans[i] = null;
            }

        }

        // Заведём переменную индикатор, отображающую, что мы сравнили все элементы с последним
        boolean endOfSearch = false;

        // Пересортируем список, чтобы всегда в начале были заполненные ячейки, а потом пустые
        for (int i = 0; i < humans.length; i++) {
            // Если встретим индикатор окончания, то дальше продолжать цикл сортировки нет смысла,
            // т.к. все элементы уже отсортировали во вложенном цикле
            if (endOfSearch==true){
                break;
            } else if (humans[i] == null) {

                for (int j = 0; j < humans.length; j++) {
                    // Если дошли до последнего элемента и он пустой,
                    // то включаем индикатор окончания поиска и завершаем всё
                    if (j==humans.length-1 && humans[j]==null){
                        endOfSearch=true;
                        break;
                    } else if (humans[j] != null && i < j) { // Иначе просто меняем элементы местами
                        humans[i] = humans[j];
                        humans[j] = null;
                        break;
                    }
                }

            }

        }

    }

    // Печать списка
    public void printList(){
        for (Human man :
                humans) {
            // Распечатаем на экран все элементы
            if (man != null){
                // Воспользуемся переопределённым методом toString() из класса Human
                System.out.println(man.toString());
            } else {
                break;
            }

        }
    }
}
