package org.example;

import static org.example.IntegerListImpl.*;

public class Main {
    public static void main(String[] args) {
        int size = 100000;
        long start = System.currentTimeMillis();
        sortInsertion(new int[]{size});
        System.out.println(System.currentTimeMillis() - start);
    }
}