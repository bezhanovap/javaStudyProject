package com.avenue.java.spb.group2.lesson13;

import java.util.ArrayList;

public class TestSpeed {
    // Поля
    private int capasityOfArrayList;
    private int valuesOfArrayList;

    // Конструкктор

    public TestSpeed() {
    }

    public TestSpeed(int capasityOfArrayList, int valuesOfArrayList) {
        this.capasityOfArrayList = capasityOfArrayList;
        this.valuesOfArrayList = valuesOfArrayList;
    }

    // Методы
    public long getExecutionTimeOfArrayList(int capasityOfArrayList, int valuesOfArrayList){
        ArrayList<Integer> numbers=new ArrayList<>(capasityOfArrayList);

        long startPoint = System.currentTimeMillis();
        int num=0;
        for (int i = 0; i < valuesOfArrayList; i++) {
            numbers.add(i, num);
            num++;
        }

        long endPoint = System.currentTimeMillis();
        long resultTime = endPoint - startPoint;

        return resultTime;
    }


    public int getCapasityOfArrayList() {
        return capasityOfArrayList;
    }

    public void setCapasityOfArrayList(int capasityOfArrayList) {
        this.capasityOfArrayList = capasityOfArrayList;
    }

    public int getValuesOfArrayList() {
        return valuesOfArrayList;
    }

    public void setValuesOfArrayList(int valuesOfArrayList) {
        this.valuesOfArrayList = valuesOfArrayList;
    }
}
