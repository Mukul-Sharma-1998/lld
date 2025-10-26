package com.example.lld.newLogger;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Logger logger = new DebugLogger(LogType.DEBUG, new ErrorLogger(LogType.ERROR, new ErrorLogger(LogType.ERROR, null)));
        logger.log(LogType.None);
    }
}
