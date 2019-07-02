package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> sort = new ArrayList<>(5);
        sort.add(4);
        sort.add(8);
        sort.add(3);
        sort.add(9);
        sort.add(5);

        System.out.println("Отсортированный список элементов:");
        Collections.sort(sort);
        for (Integer s : sort) {
            System.out.println(s);

        }
    }
}
