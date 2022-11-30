package com.avenue.java.spb.group2.lesson20;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Vasiliy", "Vasiliev", "Viktorov", 7.5, 30);
        Student student2 = new Student(2, "Petr", "Vasiliev", "Viktorov", 7.8, 31);
        Student student3 = new Student(3, "Ivan", "Vasiliev", "Viktorov", 8.1, 32);
        Student student4 = new Student(4, "Igor", "Vasiliev", "Viktorov", 9.0, 33);
        Student student5 = new Student(5, "Maxim", "Vasiliev", "Viktorov", 9.7, 34);

        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StatStudent.filterByAge(students,33);
        System.out.println("----------------------------");
        StatStudent.filterByMarkAvg(students, 8.9);
        System.out.println("----------------------------");
        StatStudent.filterByName(students, "Vas");
        System.out.println("----------------------------");


        StatStudent.filterByName2(students, new StudentPredicateImpl());

        System.out.println("----------------------------");

        StatStudent.filterByName2(students, new StudentPredicate() {
            @Override
            public boolean check(Student student) {
                return student.getFirstName().startsWith("I");
            }
        });

        System.out.println("----------------------------");
        // Лямбда
        StatStudent.filterByName2(students, (Student student) -> {return student.getFirstName().startsWith("Max");});
        System.out.println("----------------------------");

        StatStudent.filterByName2(students, student -> student.getFirstName().startsWith("Max"));



    }
}

class StatStudent{
    public static void filterByAge(List<Student> students, int age){
        for (Student student :
                students) {
            if (student.getAge()<age) System.out.println(student);
        }
    }

    public static void filterByMarkAvg(List<Student> students, double markAvg){
        for (Student student :
                students) {
            if (student.getMarkAv()<markAvg) System.out.println(student);
        }
    }

    public static void filterByName(List<Student> students, String name){
        for (Student student :
                students) {
            if (student.getFirstName().startsWith(name)) System.out.println(student);
        }
    }

    public static void filterByName2(List<Student> students, StudentPredicate predicate){
        for (Student student :
                students) {
            if (predicate.check(student)) System.out.println(student);
        }
    }


}


interface StudentPredicate{
    boolean check(Student student);
}

class StudentPredicateImpl implements StudentPredicate{

    @Override
    public boolean check(Student student) {
        return student.getFirstName().startsWith("Pe");
    }
}
