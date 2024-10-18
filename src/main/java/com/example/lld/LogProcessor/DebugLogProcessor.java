package com.example.lld.LogProcessor;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(String logLevel, String message) {
        if(logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.nextLogProcessor(logLevel, message);
        }
    }
}
