package com.avenue.java.spb.group2.lesson14;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeSet.add(201);
        treeSet.add(156);
        treeSet.add(11);
        treeSet.add(17);
        treeSet.add(112);

        TreeSet<String> treeSet1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.hashCode()-o1.hashCode();
            }
        });
        treeSet1.add("aaa");
        treeSet1.add("bbb");
        treeSet1.add("bbb");
        treeSet1.add("ddd");
        treeSet1.add("ccc");
        treeSet1.add("fff");

        System.out.println();
    }
}
