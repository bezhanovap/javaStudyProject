package com.avenue.java.spb.group2.lesson18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOFileCopy implements UtilCopy{
    @Override
    public void copy(String from, String to) {
        Path fromPath= Paths.get(from);
        Path toPath =Paths.get(to);

        try {
            Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
