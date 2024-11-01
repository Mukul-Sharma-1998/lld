package com.example.lld.fileSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileSystem file1 = new File("Lucy");
        FileSystem file2 = new File("Thor");
        FileSystem file3 = new File("End Game");

        FileSystem directory = new Directory("Hollywood", Arrays.asList(file1, file2, file3));

        FileSystem file4 = new File("Jab We Met");
        FileSystem file5 = new File("Zindagi Na Milegi Dubara");
        FileSystem file6 = new File("Sholey");
        FileSystem directory2 = new Directory("Bollywood", Arrays.asList(file4, file5, file6, directory));

        directory2.ls();


    }
}
