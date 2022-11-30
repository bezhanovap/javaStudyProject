package com.avenue.java.spb.group2.lesson20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List strings=new ArrayList();
        strings.add("Hello");
        strings.add(4);
        strings.add(new Car());

        for (Object o :
                strings) {
            String s= (String) o;
            System.out.println(s.length());
        }*/


        Example stringExample = new Example();

        List<Double> doubles=new ArrayList<>();
        doubles.add(2.1);
        doubles.add(2.2);
        doubles.add(2.3);

        stringExample.printElementsOfCollection(doubles);






        Car car=new Car("BMW", 1997, "Black", new Car.Engine(300L));

        System.out.println(car);








    }
}

class Example <T extends Number>{
    T value;

    public void showValue(){
        System.out.println(value);
    }

    public void printElementsOfCollection(List<T> values){
        for (T t:
             values) {
            System.out.println(t);
        }
    }
}
