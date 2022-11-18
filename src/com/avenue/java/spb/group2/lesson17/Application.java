package com.avenue.java.spb.group2.lesson17;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Application {
    public static final Logger LOGGER = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.debug("message");
        System.out.println("logger has started");
    }
}
