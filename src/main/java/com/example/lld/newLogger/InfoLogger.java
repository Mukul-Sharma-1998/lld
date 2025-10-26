package com.example.lld.newLogger;

public class InfoLogger extends Logger {

    public InfoLogger(LogType logType, Logger logger) {
        super(logType, logger);
    }
    @Override
    public void log(LogType logType) {
        if(logType == this.logType) System.out.println("Message logged at: "+this.logType);
        else this.nextLogger(logType);
    }
}
