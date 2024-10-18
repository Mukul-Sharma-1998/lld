package com.example.lld.LogProcessor;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(String logLevel, String message) {
        if(logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.nextLogProcessor(logLevel, message);
        }
    }
}
