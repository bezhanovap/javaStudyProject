package com.avenue.java.spb.group2.lesson18;

public class Main {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();

        IOFileCopy ioFileCopy=new IOFileCopy();
        ioFileCopy.copy("c:\\Downloads\\dppw4.3.31-installer.zip", "1.zip");

        long finish = System.currentTimeMillis();
        System.out.println("С библиотекой IO файл копируется " + (finish-start) + " секунд");

        // ------------------------------------

        long start2= System.currentTimeMillis();

        NIOFileCopy nioFileCopy=new NIOFileCopy();
        nioFileCopy.copy("c:\\Downloads\\dppw4.3.31-installer.zip", "2.zip");

        long finish2 = System.currentTimeMillis();
        System.out.println("С библиотекой NIO файл копируется " + (finish2-start2) + " секунд");

        // ------------------------------------

        long start3= System.currentTimeMillis();

        ApacheCommonIOCopy apacheCommonIOCopy= new ApacheCommonIOCopy();

        apacheCommonIOCopy.copy("c:\\Downloads\\dppw4.3.31-installer.zip", "3.zip");

        long finish3 = System.currentTimeMillis();
        System.out.println("С библиотекой ApacheCommonIO файл копируется " + (finish3-start3) + " секунд");

    }
}
