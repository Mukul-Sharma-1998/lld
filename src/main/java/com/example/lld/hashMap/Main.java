package com.example.lld.hashMap;

public class Main {
    public static void main(String[] args) {
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("Mukul1", "Sharma");
        System.out.println(myMap.currentSize);
        myMap.put("Mukul2", "Sharma");
        myMap.put("Mukul3", "Sharma");
        myMap.put("Mukul4", "Sharma");
        myMap.put("Mukul5", "Sharma");
        myMap.put("Mukul6", "Sharma");
        myMap.put("Mukul7", "Sharma");
        myMap.put("Mukul8", "Sharma");
        myMap.put("Mukul9", "Sharma");
        myMap.put("Mukul10", "Sharma");
        myMap.put("Mukul11", "Sharma");
        myMap.put("Mukul12", "Sharma");
        myMap.put("Mukul13", "Sharma");
        myMap.put("Mukul14", "Sharma");
        myMap.put("Mukul15", "Sharma");
        myMap.put("Mukul16", "Sharma");
        myMap.put("Mukul17", "Sharma");
        myMap.put("Mukul18", "Sharma");
        myMap.put("Mukul19", "Sharma");
        myMap.put("Mukul20", "Sharma");
        System.out.println(myMap.bucketInUse);
        System.out.println(myMap.currentSize);
        System.out.println(myMap.get("Mukul"));
        System.out.println(myMap.get("Divya"));
        myMap.put("Divya", "Sabharwal");
        System.out.println(myMap.get("Divya"));

        MyMap<Integer, Integer> myMap1 = new MyMap<>(65);
        System.out.println(myMap1.currentSize);

    }
}
