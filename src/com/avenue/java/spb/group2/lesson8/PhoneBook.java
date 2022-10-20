package com.avenue.java.spb.group2.lesson8;

public class PhoneBook {
    // 1. Поля

    private Contact[] contacts = new Contact[100];

    // 2. Конструктор

    // 3. Методы
    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public void search(String forSearch) {
        for (Contact c :
                contacts) {
            if (c != null &&
                    (c.getName().contains(forSearch) ||
                            c.getEmail().contains(forSearch) ||
                            c.getPhoneNumber().contains(forSearch))
            ) {

                System.out.println(c.getName());
            }
        }
    }

    public void edit(String forSearch, String forEdit) {
        for (Contact c :
                contacts) {
            if (c != null) {
                if (c.getName().contains(forSearch)) {
                    c.setName(forEdit);
                } else if (c.getEmail().contains(forSearch)) {
                    c.setEmail(forEdit);
                } else if (c.getPhoneNumber().contains(forSearch)) {
                    c.setPhoneNumber(forEdit);
                }
            } else {
                break;
            }
        }
    }

    public void delete(String forSearch) {
        for (int i = 0; i < contacts.length; i++) {
            // Если находим нулевой элемент, то заканчиваем, т.к. дальше ничего нет
            if (contacts[i] == null) {
                break;
            } else if (contacts[i] != null && contacts[i].getName().contains(forSearch)) { // Удаляем запись
                contacts[i] = null;
            }

        }

        // Заведём переменную индикатор, отображающую, что мы сравнили все элементы с последним
        boolean endOfSearch = false;

        // Пересортируем книгу, чтобы всегда в начале были заполненные ячейки, а потом пустые
        for (int i = 0; i < contacts.length; i++) {
            // Если встретим индикатор окончания, то дальше продолжать цикл сортировки нет смысла,
            // т.к. все элементы уже отсортировали во вложенном цикле
            if (endOfSearch==true){
                break;
            } else if (contacts[i] == null) {

                for (int j = 0; j < contacts.length; j++) {
                    // Если дошли до последнего элемента и он пустой,
                    // то включаем индикатор окончания поиска и завершаем всё
                    if (j==contacts.length-1 && contacts[j]==null){
                        endOfSearch=true;
                        break;
                    } else if (contacts[j] != null && i < j) { // Иначе просто меняем элементы местами
                        contacts[i] = contacts[j];
                        contacts[j] = null;
                        break;
                    }
                }

            }

        }
    }

}
