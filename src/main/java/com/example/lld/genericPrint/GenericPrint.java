package com.example.lld.genericPrint;

import java.util.Arrays;

public class GenericPrint<T> {

//    public static <T> void genericPrint(T item) {
//        System.out.println("Single line: "+ item);
//    }

//    public static <T> void genericPrint(T[] items) {
//        System.out.println("Array items: "+ Arrays.toString(items));
//    }

    public static <T> void genericPrint(T... items) {
        System.out.println("Variable items: "+ Arrays.toString(items));
    }
}
