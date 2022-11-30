package com.avenue.java.spb.group2.lesson20;

import java.util.List;

public class AnonymousClass {
    public static void main(String[] args) {
        String[] str = new String[]{"BMW", "Audi", "Toyota"};

        List<String> strings = List.of("BMW", "Audi", "Toyota");
        print(strings, new B());

    }

    public static void print(List<String> strings, B b){
        for (String s :
                strings) {
            if (b.test(s)) System.out.println(s);
        }
    }
}

interface A{
    boolean test(String s);
}


class B implements A{

    @Override
    public boolean test(String s) {
        return s.startsWith("B");
    }
}