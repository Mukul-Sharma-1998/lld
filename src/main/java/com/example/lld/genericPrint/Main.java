package com.example.lld.genericPrint;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        List<Integer> list = Arrays.asList(9,9,0);
        GenericPrint.genericPrint(list,1,2,3,4,"Mukul",arr);

    }
}
