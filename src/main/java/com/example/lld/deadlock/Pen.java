package com.example.lld.deadlock;

public class Pen {

    public synchronized void write(Paper paper) {
        System.out.println("pen is writing with paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println("pen has completed writing");
    }
}
