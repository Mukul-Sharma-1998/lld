package com.example.lld.LogProcessor;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.nextLogProcessor(logLevel, message);
        }
    }
}