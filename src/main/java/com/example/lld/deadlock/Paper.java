package com.example.lld.deadlock;

public class Paper {

    public synchronized void write(Pen pen) {
        System.out.println("paper is writing with pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println("Paper has completed writing");
    }
}
