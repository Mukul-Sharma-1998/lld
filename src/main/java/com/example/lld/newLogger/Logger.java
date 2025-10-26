package com.example.lld.newLogger;

public abstract class Logger {
    LogType logType;
    Logger logger;
    public Logger(LogType logType, Logger logger) {
        this.logger = logger;
        this.logType = logType;
    }
    public abstract void log(LogType logType);

    public void nextLogger(LogType logType) {
        if(this.logger!=null) this.logger.log(logType);
        else System.out.println("Invalid logging request!");
    }
}
