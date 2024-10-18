package com.example.lld.LogProcessor;

public class main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log("DEBUG", "Debug log message");
    }
}
