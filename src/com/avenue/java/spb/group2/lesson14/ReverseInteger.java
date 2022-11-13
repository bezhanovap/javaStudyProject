package com.avenue.java.spb.group2.lesson14;

import java.util.Comparator;

public class ReverseInteger implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
