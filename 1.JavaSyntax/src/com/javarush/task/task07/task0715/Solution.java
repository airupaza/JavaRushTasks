package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String stoka = "именно";

        ArrayList<String> mass = new ArrayList<>();

        mass.add("мама");
        mass.add(stoka);
        mass.add("мыла");
        mass.add(stoka);
        mass.add("раму");
        mass.add(stoka);

        for (int i = 0; i < mass.size(); i++) {
            System.out.println(mass.get(i));
        }
    }
}
