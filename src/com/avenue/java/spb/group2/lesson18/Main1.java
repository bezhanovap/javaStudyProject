package com.avenue.java.spb.group2.lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main1 {
    public static void main(String[] args) {
        File startDir= new File("C:\\TestJava\\asdfg");
        if (!startDir.exists()){
            startDir.mkdirs();
        }

        File secondDir=new File("c:\\Downloads\\");
        File[] files= secondDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jpeg") ||
                        pathname.getName().endsWith(".png");
            }
        });

        for (File f :
                files) {
            System.out.println(f.getName());
        }
        System.out.println();

    }
}
