package org.example;

import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class);
        logger.error("Yikes");
    }
}