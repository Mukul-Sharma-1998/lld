package com.example.lld.LogProcessor;

public abstract class LogProcessor {

    public String INFO = "INFO";
    public String DEBUG = "DEBUG";
    public String ERROR = "ERROR";
    public LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public abstract void log(String logLevel, String message);

    public void nextLogProcessor(String logLevel, String message) {
        if(this.nextLogProcessor != null) {
            this.nextLogProcessor.log(logLevel, message);
        }
        else {
            System.out.println("This log type cannot be supproted");
        }
    }

}
