package com.avenue.java.spb.group2.lesson11;

public class lesson11 {
    public static void main(String[] args) {
        int f = factorial(5);

    }

    static int factorial(int x){

        if (x==1){
            return 1;
        }else{
            return x*factorial(x-1);
        }

    }
}
