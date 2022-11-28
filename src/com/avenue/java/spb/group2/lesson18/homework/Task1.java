package com.avenue.java.spb.group2.lesson18.homework;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*1
        Реализуй логику методов:
        1. readBytes - должен возвращать все байты файла fileName.
        2. readLines - должен возвращать все строки файла fileName. Используй кодировку по умолчанию.
        3. writeBytes - должен записывать массив bytes в файл fileName.
        4. copy - должен копировать файл resourceFileName на место destinationFileName.

        public static byte[] readBytes(String fileName) throws IOException {
            return null;
        }

        public static List<String> readLines(String fileName) throws IOException {
            return null;
        }

        public static void writeBytes(String fileName, byte[] bytes) throws IOException {
        }

        public static void copy(String resourceFileName, String destinationFileName) throws IOException {
        }*/

    public static void main(String[] args) {
        String resourceFile = "c:\\Downloads\\dppw4.3.31-installer.zip";
        String resourceFileLines = "c:\\Downloads\\animals_water_need.csv";
        String destinationFile = "1.zip";
        String destinationFileCopy = "2.zip";

        byte [] resourceFileBytes=null;

        try {
            resourceFileBytes= readBytes(resourceFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> fileLines=null;
        
        try {
            fileLines = readLines(resourceFileLines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String str : fileLines)
            System.out.println(str);


        try {
            writeBytes(destinationFile, resourceFileBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            copy(resourceFile, destinationFileCopy);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static byte[] readBytes(String fileName) throws IOException {
        return Files.readAllBytes(Path.of(fileName));
    }

    public static List<String> readLines(String fileName) throws IOException {
        return Files.readAllLines(Path.of(fileName));
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
        Files.write(Path.of(fileName), bytes);
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
        Files.copy(Path.of(resourceFileName), Path.of(destinationFileName));
    }

}
