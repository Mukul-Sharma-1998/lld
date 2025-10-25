package com.example.lld.deadlock;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {
    public static void main(String[] args) {
        System.out.println("start");
        Pen pen = new Pen();
        Paper paper = new Paper();
        Task1 task1 = new Task1(pen, paper);
        Task2 task2 = new Task2(pen, paper);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

    }
}
