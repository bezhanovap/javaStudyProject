package com.avenue.java.spb.group2.lesson13;

public class Main_2 {
    public static void main(String[] args) {
        TestSpeed ts=new TestSpeed();
        ts.setCapasityOfArrayList(10);
        ts.setValuesOfArrayList(40000000);
        System.out.println(ts.getExecutionTimeOfArrayList(ts.getCapasityOfArrayList(), ts.getValuesOfArrayList()));
    }

}
