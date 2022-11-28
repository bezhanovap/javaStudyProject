package com.avenue.java.spb.group2.lesson18;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ApacheCommonIOCopy implements UtilCopy{

    @Override
    public void copy(String from, String to) {
        File fromFile = new File(from);
        File toFile =new File(to);

        try {
            FileUtils.copyFile(fromFile, toFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
